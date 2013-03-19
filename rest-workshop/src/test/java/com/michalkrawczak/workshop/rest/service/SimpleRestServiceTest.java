package com.michalkrawczak.workshop.rest.service;


import com.michalkrawczak.workshop.rest.model.SimpleModel;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static junit.framework.Assert.*;

/**
 * User: lahim
 * Date: 3/19/13
 */
public class SimpleRestServiceTest {

    private static final Logger logger = LoggerFactory.getLogger(SimpleRestServiceTest.class);

    private SimpleService simpleService;

    @Before
    public void setUp() throws Exception {
        logger.debug("---- setUp");

        simpleService = new SimpleServiceImpl();
    }

    @After
    public void cleanUp() throws Exception {
        logger.debug("---- cleanUp");
    }

    @Test
    public void helloTest() throws Exception {
        logger.debug("---- hello");

        SimpleModel model;

        assertNotNull(simpleService);

        model = simpleService.hello("Wilson");

        assertNotNull(model);
        assertEquals("Hi, Wilson!", model.getMessage());
        logger.debug(String.format("message: %s", model.getMessage()));

        assertNotNull(model.getDate());
        logger.debug(String.format("date: %s", model.getDate().toString()));

        assertNull(model.getValue());

        logger.debug("Test passed!");
    }

    @Test
    public void createTest() throws Exception {
        logger.debug("---- createTest");

        SimpleModel model;

        model = simpleService.create(new SimpleModel("Test message", "Test value"));

        assertNotNull(model);

        assertNotNull(model.getMessage());
        assertEquals("Simple model was created successfully!", model.getMessage());
        logger.debug(String.format("message: %s", model.getMessage()));

        assertNotNull(model.getValue());
        assertEquals("Test value", model.getValue());
        logger.debug(String.format("value: %s", model.getValue()));

        assertNotNull(model.getDate());
        logger.debug(String.format("date: %s", model.getDate().toString()));

        logger.debug("Test passed!");
    }

    @Test
    public void updateTest() throws Exception {
        logger.debug("---- updateTest");

        SimpleModel model;

        model = simpleService.update(new SimpleModel("Test message", "Test value"));

        assertNotNull(model);

        assertNotNull(model.getMessage());
        assertEquals("Test message", model.getMessage());
        logger.debug(String.format("message: %s", model.getMessage()));

        assertNotNull(model.getValue());
        assertEquals("Test value", model.getValue());
        logger.debug(String.format("value: %s", model.getValue()));

        assertNotNull(model.getDate());
        logger.debug(String.format("date: %s", model.getDate().toString()));

        logger.debug("Test passed!");
    }

}
