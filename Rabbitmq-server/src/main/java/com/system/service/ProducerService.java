package com.system.service;

import org.springframework.stereotype.Service;

@Service
public interface ProducerService {

    public void sendMessage(String message);

}
