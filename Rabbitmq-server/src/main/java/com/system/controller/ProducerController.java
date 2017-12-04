package com.system.controller;

import com.system.bean.ResponseData;
import com.system.service.ProducerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ProducerController extends BaseController {

    @Resource
    private ProducerService producerService;

    @RequestMapping(value = "/producerMsg", method = RequestMethod.POST)
    public ResponseData producerMessage(String message) {
        producerService.sendMessage(message);
        return ResponseData.ok();
    }

}
