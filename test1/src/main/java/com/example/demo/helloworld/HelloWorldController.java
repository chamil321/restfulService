package com.example.demo.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping( path = "/helloworld")
    public String helloWorld() {
        return "chamil";
    }

    @GetMapping( path = "/helloworldBean")
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("chamil");
    }

    @GetMapping( path = "/helloworldBean/{name}")
    public HelloWorldBean helloWorldPath(@PathVariable String name) {
        return new HelloWorldBean(String.format("Hello world, %s", name));
    }
}
