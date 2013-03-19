package com.michalkrawczak.workshop.rest.controller;

import com.michalkrawczak.workshop.rest.model.SimpleModel;
import com.michalkrawczak.workshop.rest.service.SimpleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * User: lahim
 * Date: 3/18/13
 */
@Controller
@RequestMapping("/api")
public class SimpleRestController {

    private static final Logger logger = LoggerFactory.getLogger(SimpleRestController.class);

    private SimpleService simpleService;

    @RequestMapping(value = "/hello/{param}", method = RequestMethod.GET)
    public @ResponseBody SimpleModel hello(@PathVariable String param) {
        if (logger.isDebugEnabled())
            logger.debug("---- hello");
        SimpleModel model = simpleService.hello(param);

        // Add some code...

        return model;
    }

    @RequestMapping(
            value = "/simple", method = RequestMethod.POST,
            consumes = { MediaType.APPLICATION_JSON_VALUE },
            produces = { MediaType.APPLICATION_JSON_VALUE }
    )
    public @ResponseBody SimpleModel create(@RequestBody SimpleModel model) {
        if (logger.isDebugEnabled())
            logger.debug("---- create");

        SimpleModel newModel = simpleService.create(model);

        // Add some code...

        return newModel;
    }

    @RequestMapping(
            value = "/simple/{id}", method = RequestMethod.PUT,
            consumes = { MediaType.APPLICATION_JSON_VALUE },
            produces = { MediaType.APPLICATION_JSON_VALUE }
    )
    public @ResponseBody SimpleModel update(
            @PathVariable String id, @RequestBody SimpleModel model
    ) {
        if (logger.isDebugEnabled()) {
            logger.debug("---- update");
            logger.debug(String.format("id: %s", id));
        }

        model = simpleService.update(model);

        // Add some code...

        return model;
    }

    @Autowired
    public void setSimpleService(@Qualifier("simpleService") SimpleService simpleService) {
        this.simpleService = simpleService;
    }
}
