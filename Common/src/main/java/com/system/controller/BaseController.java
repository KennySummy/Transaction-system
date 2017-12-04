package com.system.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

public class BaseController {

    @GetMapping
    @ResponseBody
    public Map<String, Object> index() {
        Map<String, Object> response = new HashMap<>();
        response.put("code", 200);
        response.put("message", "Ok");
        response.put("data", new HashMap<String, String>());
        return response;
    }
}
