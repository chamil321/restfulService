package com.example.demo.helloworld;

public class HelloWorldBean {
    private String name;

    public HelloWorldBean(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return String.format("Hello World bean %s", name);
    }
}
