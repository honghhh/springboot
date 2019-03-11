package com.springboot.twoday.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
* @description: index
* @author:      huangh
* @createDate:  2019/3/8 9:31
*/
@Controller
public class IndexController {

    /**
    * index页面
    * @param
    * @return
    * @author huangh
    */
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(){
        return "index";
    }

}
