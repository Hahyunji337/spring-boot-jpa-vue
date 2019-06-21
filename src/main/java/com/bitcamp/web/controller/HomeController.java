package com.bitcamp.web.controller;

import com.bitcamp.web.common.util.Printer;
import com.bitcamp.web.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * HomeController
 */
@Controller
public class HomeController {
    //내용물 깃허브꺼 갖다붙이기
    //내용은 갖다붙이는데 파일은 여기서 직접 만들어야함
    @Autowired CustomerService customerService; 
    @Autowired Printer p;
    @RequestMapping("/")   
    public String index() {
        // p.accept("람다 이후 루트 URL 경로로 들어옴 ");
        // int count = customerService.countAll();
        // p.accept("람다가 출력한 고객의 총인원 : "+count);
        System.out.println("index에 들어옴");
        return "index";
    }
}