package com.michalkrawczak.workshop.rest.service;

import com.michalkrawczak.workshop.rest.model.SimpleModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * User: lahim
 * Date: 3/19/13
 */
@Service("simpleService")
public class SimpleServiceImpl implements SimpleService {

    private static final Logger logger = LoggerFactory.getLogger(SimpleServiceImpl.class);

    @Override
    public SimpleModel hello(String param) {
        if (logger.isDebugEnabled())
            logger.debug("---- hello");

        SimpleModel model = new SimpleModel(String.format("Hi, %s!", param));

        // Add here some logic...

        return model;
    }

    @Override
    public SimpleModel create(SimpleModel model) {
        if (logger.isDebugEnabled())
            logger.debug("---- create");

        SimpleModel newModel = new SimpleModel();
        newModel.setValue(model.getValue());
        newModel.setMessage("Simple model was created successfully!");
        newModel.setDate(new Date());

        // Add here some logic...

        return newModel;
    }

    @Override
    public SimpleModel update(SimpleModel model) {
        if (logger.isDebugEnabled())
            logger.debug("---- update");

        SimpleModel updatedModel = new SimpleModel();

        updatedModel.setMessage(model.getMessage());
        updatedModel.setValue(model.getValue());
        updatedModel.setDate(new Date());

        // Add here some logic...

        return updatedModel;
    }
}
