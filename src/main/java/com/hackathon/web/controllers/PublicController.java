package com.hackathon.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by hitenpratap on 27/01/17.
 */
@Controller
public class PublicController {

    @RequestMapping(method = GET, value = "/")
    public String index() {
        return "public/index";
    }

}
