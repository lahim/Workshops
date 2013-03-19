package com.michalkrawczak.workshop.rest;

import com.michalkrawczak.workshop.rest.model.SimpleModel;
import com.michalkrawczak.workshop.rest.service.SimpleService;
import org.mockito.Matchers;

import java.util.Date;

import static org.mockito.Mockito.*;

/**
 * User: lahim
 * Date: 3/19/13
 */
public class MockContainer {

    public static final  SimpleService simpleService = mock(SimpleService.class);

    public static MockContainer getMockContainer() {
        MockContainer mock = new MockContainer();
        when(mock.simpleService.hello(anyString())).thenReturn(prepareSimpleModelMock());
        when(mock.simpleService.create(Matchers.<SimpleModel>any())).thenReturn(prepareSimpleModelMock());
        when(mock.simpleService.update(Matchers.<SimpleModel>any())).thenReturn(prepareSimpleModelMock());
        return mock;
    }

    private static SimpleModel prepareSimpleModelMock() {
        SimpleModel model = new SimpleModel("Mock message");
        model.setDate(new Date());
        model.setValue("Mock value");
        return model;
    }
}
