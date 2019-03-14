package com.springboot.day11.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.UUID;

/**
 * 上传文件控制器
 * @author: huangh
 */
@Controller
public class UploadController {
    
    /**
     * 初始化上传文件界面，跳转到index.jsp
     * @return
     */
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        return "index";
    }
    
    /**
     * 上传单个文件方法
     * @param request 请求对象
     * @param file 上传文件对象
     * @return
     */
    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    @ResponseBody
    public String upload(HttpServletRequest request, MultipartFile file) {
        try {
            // 上传目录地址
            String uploadDir = request.getSession().getServletContext().getRealPath("/") + "upload/";
            // 如果目录不存在，自动创建文件夹
            File dir = new File(uploadDir);
            if (!dir.exists()) {
                dir.mkdir();
            }
            executeUpload(uploadDir, file);
            /*// 文件后缀
            String suffix = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
            // 上传文件名(可使用UUID.randomUUID() 或 微毫秒获取方式：System.nanoTime())
            String filename = UUID.randomUUID() + suffix;
            // 服务端保存的文件对象
            File serverFile = new File(uploadDir + filename);
            // 将上传的文件写入到服务端文件内
            file.transferTo(serverFile);*/
        } catch (Exception e) {
            // 打印错误堆栈信息
            e.printStackTrace();
            return "上传失败";
        }
        return "上传成功";
    }
    
    /**
     * 上传多个文件方法
     * @param request 请求对象
     * @param file 上传文件对象数组
     * @return
     */
    @RequestMapping(value = "/uploads", method = RequestMethod.POST)
    @ResponseBody
    public String uploads(HttpServletRequest request, MultipartFile[] file) {
        try {
            // 上传目录地址
            String uploadDir = request.getSession().getServletContext().getRealPath("/") + "upload/";
            // 如果目录不存在，自动创建文件夹
            File dir = new File(uploadDir);
            if (!dir.exists()) {
                dir.mkdir();
            }
            // 遍历文件数组执行上传
            for (int i = 0; i < file.length; i++) {
                if (file[i] != null) {
                    executeUpload(uploadDir, file[i]);
                }
            }
        } catch (Exception e) {
            // 打印错误堆栈信息
            e.printStackTrace();
            return "上传失败";
        }
        return "上传成功";
    }
    
    /**
     * 上传单个文件公用方法
     * @param
     * @return
     */
    private void executeUpload(String uploadDir, MultipartFile file) throws Exception {
        // 文件后缀名
        String subbfix = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
        // 上传文件名
        String filename = UUID.randomUUID() + subbfix;
        // 服务端保存的文件对象
        File serverFile = new File(uploadDir + filename);
        // 将上传的文件写入到服务端文件内
        file.transferTo(serverFile);
    }
    
}
