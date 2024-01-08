package com.rso.keydash.reportms.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/reports")
public class ReportResource {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }
}
