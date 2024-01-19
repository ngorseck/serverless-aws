package com.samanecorporation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@RestController
@EnableWebMvc
@RequestMapping("api")
public class HelloController {

  @GetMapping("/hello")
  public String sayHello() {

    return "Hello, this is my first aws serverless app";
  }
}
