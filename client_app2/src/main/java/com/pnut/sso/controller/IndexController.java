package com.pnut.sso.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lch
 * @since 2018年11月29日 10:17:21
 */
@RestController
public class IndexController {

    @RequestMapping("/index")
    public String index(){
        return " index 接口";
    }

    @RequestMapping("/world")
    public String world(){
        return " world 接口";
    }
}
