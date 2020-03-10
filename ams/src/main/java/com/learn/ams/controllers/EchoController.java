package com.learn.ams.controllers;

import com.learn.ams.constansts.ApiEndPoints;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = ApiEndPoints.AMS + ApiEndPoints.ECHO)
public class EchoController {

    @GetMapping
    public String echo(@RequestParam (name = "massage") String massage) {
        return "Massage : " + massage;
    }
}
