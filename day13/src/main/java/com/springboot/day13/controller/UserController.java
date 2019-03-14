package com.springboot.day13.controller;

import com.springboot.day13.entity.UserEneity;
import com.springboot.day13.jpa.UserJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description: 用户控制器
 * @author: huangh
 * @createDate: 2019/3/9 13:38
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {
    
    @Autowired
    private UserJPA userJPA;
    
    /**
     * 查询用户列表
     * @return
     * @author huangh
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<UserEneity> list() {
        return userJPA.findAll();
    }
    
    /**
     * 添加用户对象
     * @return
     * @author huangh
     */
    @RequestMapping(value = "/add")
    public String add() {
        // 如果错误为Incorrect string value: '\xE6\xB5\x8B\xE8\xAF\x95，查看数据库表，字段编码格式是否正确
        UserEneity userEneity = new UserEneity();
        userEneity.setAge(21);
        userEneity.setAddress("测试地址");
        userEneity.setName("测试");
        userJPA.save(userEneity);
        return "用户信息添加成功";
    }
    
    /**
     * 删除用户对象
     * @param  userId 用户id
     * @return
     * @author huangh
     */
    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String delete(Long userId) {
        userJPA.delete(userId);
        return "用户信息删除成功";
    }
    
    /**
     * 查询大于20岁的用户
     * @param
     * @return
     */
    @RequestMapping(value = "/age")
    public List<UserEneity> age() {
        return userJPA.nativeQuery(20);
    }
    
    /**
     * 根据条件自定义编写删除SQL
     * @return
     */
    @RequestMapping(value = "/deleteWhere")
    public String delete() {
        userJPA.deleteQuery("admin", "123456");
        return "自定义SQL删除数据成功";
    }
    
    /**
     * 分页+排序查询测试
     * @param page 传入页码
     * @return
     */
    @RequestMapping(value = "/cutpage")
    public List<UserEneity> cutPage(int page) {
        UserEneity userEneity = new UserEneity();
        userEneity.setPage(page);
        userEneity.setSize(2);
        userEneity.setSort("desc");
        
        // 和升序枚举对比，获取排序对象
        // equalsIgnoreCase忽略大小写
        Sort.Direction sort_direction = Sort.Direction.ASC.toString().equalsIgnoreCase(userEneity.getSort()) ? Sort.Direction.ASC : Sort.Direction.DESC;
        // 设置排序对象Sort参数 第一个参数排序顺序，第二个参数排序字段
        Sort sort = new Sort(sort_direction, userEneity.getSidx());
        
        // 创建分页对象，将分页参数和排序参数放入，分页page从0开始
        PageRequest pageRequest = new PageRequest(userEneity.getPage() - 1, userEneity.getSize(), sort);
        // 将分页对象加入分页查询 findAll方法返回值Page可取总条数、总页数。getContent取内容。
        return userJPA.findAll(pageRequest).getContent();
    }
    
}
