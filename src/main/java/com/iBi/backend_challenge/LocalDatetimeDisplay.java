package com.iBi.backend_challenge;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class LocalDatetimeDisplay {

    @RequestMapping(method = RequestMethod.GET, path = "/displayCurrentTime")
    public String displayCurrentTime() {
        return LocalDateTime.now().toString();
    }
}
