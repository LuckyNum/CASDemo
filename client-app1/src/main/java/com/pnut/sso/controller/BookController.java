package com.pnut.sso.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * @author lch
 * @since 2018年11月29日 10:30:12
 */
@RestController
@RequestMapping("/book")
public class BookController {

    @GetMapping("/books")
    public List<String> books() {
        return Arrays.asList("《项塔兰》", "《肖申克的救赎？》", "《人类的群星闪耀时》", "《当我跑步时，我谈些什么》");
    }

    @GetMapping("/books2")
    public List<String> books2() {
        return Arrays.asList("《AAA》", "《BBB》", "《CCC》", "《DDD》");
    }

}