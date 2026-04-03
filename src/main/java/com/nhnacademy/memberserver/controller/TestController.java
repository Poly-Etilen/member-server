package com.nhnacademy.memberserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class TestController {

    @GetMapping("/health")
    public String healthCheck() {
        return "MemberServer 통신 성공!";
    }
}
