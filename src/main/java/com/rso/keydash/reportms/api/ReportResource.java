package com.rso.keydash.reportms.api;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ReportResource {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }
}