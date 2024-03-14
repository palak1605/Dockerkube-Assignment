package com.nagarro.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@RestController
public class DockerkubeController {

    @GetMapping("/data")
    public Map<String, Object> getDatas(){
        Map<String, Object> data = new HashMap<>();
        data.put("message", "Java API working fine");
        data.put("languages", Arrays.asList("Java", "Python", "C++", "C#"));
        data.put("code", 2345);
        data.put("money", 9999.99);
        return data;
    }
}
