package com.michalkrawczak.workshop.rest.controller;

import com.michalkrawczak.workshop.rest.MockContainer;
import com.michalkrawczak.workshop.rest.model.SimpleModel;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static junit.framework.Assert.*;

/**
 * User: lahim
 * Date: 3/18/13
 */
public class SimpleRestControllerTest {

    private static final Logger logger = LoggerFactory.getLogger(SimpleRestControllerTest.class);

    private SimpleRestController controller;


    @Before
    public void setUp() throws Exception {
        logger.debug("---- setUp");

        MockContainer mock = MockContainer.getMockContainer();

        controller = new SimpleRestController();
        controller.setSimpleService(mock.simpleService);
    }

    @After
    public void cleanUp() throws Exception {
        logger.debug("---- cleanUp");
    }

    @Test
    public void helloTest() throws Exception {
        logger.debug("---- helloTest");

        final SimpleModel model;

        assertNotNull(controller);

        model = controller.hello("Willson");
        assertNotNull(model);

        assertNotNull(model.getMessage());
        assertEquals("Mock message", model.getMessage());
        logger.debug(String.format("message value: %s", model.getMessage()));

        assertNotNull(model.getDate());
        logger.debug(String.format("date value: %s", model.getDate().toString()));

        assertNotNull(model.getValue());
        assertEquals("Mock value", model.getValue());
        logger.debug(String.format("value: %s", model.getValue()));

        logger.debug("Test passed!");
    }

    @Test
    public void createTest() throws Exception {
        logger.debug("---- createTest");

        final SimpleModel newModel = new SimpleModel();
        final SimpleModel model;

        newModel.setValue("Test mock value");

        assertNotNull(controller);
        assertNotNull(newModel);

        model = controller.create(newModel);
        assertNotNull(model);

        assertNotNull(model.getMessage());
        assertEquals("Mock message", model.getMessage());
        logger.debug(String.format("model message: %s", model.getMessage()));

        assertNotNull(model.getDate());
        logger.debug(String.format("model date: %s", model.getDate().toString()));

        assertNotNull(model.getValue());
        assertEquals("Mock value", model.getValue());
        logger.debug(String.format("model value: %s", model.getValue()));

        logger.debug("Test passed!");
    }

    @Test
    public void updateTest() throws Exception {
        logger.debug("---- updateTest");

        final SimpleModel newModel = new SimpleModel();
        final SimpleModel model;

        newModel.setValue("Test mock value");

        assertNotNull(controller);
        assertNotNull(newModel);

        model = controller.update("ID", newModel);
        assertNotNull(model);

        assertNotNull(model.getMessage());
        assertEquals("Mock message", model.getMessage());
        logger.debug(String.format("model message: %s", model.getMessage()));

        assertNotNull(model.getDate());
        logger.debug(String.format("model date: %s", model.getDate().toString()));

        assertNotNull(model.getValue());
        assertEquals("Mock value", model.getValue());
        logger.debug(String.format("model value: %s", model.getValue()));

        logger.debug("Test passed!");
    }

}
