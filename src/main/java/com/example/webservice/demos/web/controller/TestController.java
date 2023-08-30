package com.example.webservice.demos.web.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {




    @RequestMapping("/test")
      public String login(){


        System.out.println("this is test controller");
        return "test controller";
      }
}
