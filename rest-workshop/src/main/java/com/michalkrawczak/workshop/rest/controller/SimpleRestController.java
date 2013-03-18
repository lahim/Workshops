package com.michalkrawczak.workshop.rest.controller;

import com.michalkrawczak.workshop.rest.model.SimpleModel;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * User: lahim
 * Date: 3/18/13
 */
@Controller
@RequestMapping("/api")
public class SimpleRestController {

    @RequestMapping(value = "/hello/{param}", method = RequestMethod.GET)
    public @ResponseBody SimpleModel hello(@PathVariable String param) {
        return new SimpleModel(String.format("Hi, %s!", param));
    }

    @RequestMapping(
            value = "/simple", method = RequestMethod.POST,
            consumes = { MediaType.APPLICATION_JSON_VALUE },
            produces = { MediaType.APPLICATION_JSON_VALUE }
    )
    public @ResponseBody SimpleModel create(@RequestBody SimpleModel model) {
        model.setMessage("Simple model was created successfully!");
        model.setDate(new Date());
        return model;
    }

}
