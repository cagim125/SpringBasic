package com.oh.demo.controller;

// import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oh.demo.service.HelloService;

@RestController
public class HelloController {
  
  final HelloService helloService;

  public HelloController(HelloService helloService) {
    this.helloService = helloService;
  }

  @GetMapping("/hello")
  public String hello() {
    return helloService.printHello();
  }
}
