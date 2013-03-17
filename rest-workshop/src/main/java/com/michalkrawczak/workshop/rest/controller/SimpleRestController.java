package com.michalkrawczak.workshop.rest.controller;

import com.michalkrawczak.workshop.rest.model.SimpleModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api")
public class SimpleRestController {

    @RequestMapping(value = "/hello/{param}", method = RequestMethod.GET)
    public @ResponseBody SimpleModel hello(@PathVariable String param) {
        return new SimpleModel(String.format("Hi, %s!", param));
    }

}
