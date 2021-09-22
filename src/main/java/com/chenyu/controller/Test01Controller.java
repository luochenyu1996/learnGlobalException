package com.chenyu.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class Test01Controller {
    @GetMapping("/test01")
    public void test01(){
      String string=null;
      string.equals("2");
      log.info("进入测试类");
    }

}
