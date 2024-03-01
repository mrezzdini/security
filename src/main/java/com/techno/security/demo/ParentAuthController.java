package com.techno.security.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/parent")
public class ParentAuthController {

    @GetMapping
    public String get(){
        return "GET:: parent controller";
    }

    @PostMapping
    public String post(){
        return "POST:: parent controller";
    }

    @PutMapping
    public String put(){
        return "PUT:: parent controller";
    }

    @DeleteMapping
    public String delete(){
        return "DELETE:: parent controller";
    }
}
