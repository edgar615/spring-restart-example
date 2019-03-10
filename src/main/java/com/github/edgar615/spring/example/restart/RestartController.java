package com.github.edgar615.spring.example.restart;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestartController {

    @PostMapping("/restart")
    public void restart() {
        Application.restart();
    }
}
