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
        return Arrays.asList("《Java》", "《C#？》", "《NodeJs》", "《Docker》");
    }

}