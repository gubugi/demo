package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class MainController {

    @GetMapping(value = "/")
    public String main() {
        log.info("## Log : 메인 API 로드");
        return "Hello! Java";
    }
}
