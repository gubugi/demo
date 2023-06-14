package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class MainController {

    @GetMapping(value = "/")
    public String main() {
        // 주석 추가 ㅇㅇㅇ
        log.info("## Log : 메인 API 로드");
        return "SQMS! 빌드 테스트";
    }
}
