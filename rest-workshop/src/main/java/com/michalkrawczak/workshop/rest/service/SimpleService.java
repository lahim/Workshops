package com.michalkrawczak.workshop.rest.service;

import com.michalkrawczak.workshop.rest.model.SimpleModel;

/**
 * User: lahim
 * Date: 3/19/13
 */
public interface SimpleService {

    SimpleModel hello(String param);

    SimpleModel create(SimpleModel model);

    SimpleModel update(SimpleModel model);

}
