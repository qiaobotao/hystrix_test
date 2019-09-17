package com.qiaobotao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author 乔伯涛  qiaobotao@jd.com
 * @描述
 * @create 2019-09-17 20:20
 **/
@Controller
@RequestMapping("/test")
public class Welcome {
    @RequestMapping(value="welcome",method = {RequestMethod.GET,RequestMethod.POST})
    public String index() {
        return "welcome";
    }

}
