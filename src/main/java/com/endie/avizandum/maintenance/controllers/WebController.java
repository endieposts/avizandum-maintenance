package com.endie.avizandum.maintenance.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping(path = "/")
    public String index() {
        return "unverified";
    }

    @GetMapping(path = "/verified")
    public String verified() {
        return "verified";
    }
}
