package com.theniceidea.summer.springproxyvertx.base;

import com.theniceidea.summer.model.AbsModel;
import com.theniceidea.summer.model.LocalModel;
import com.theniceidea.summer.model.OptionalServiceModel;
import io.vertx.ext.web.RoutingContext;

public class RestExceptionModel extends AbsModel implements LocalModel, OptionalServiceModel {

    private RoutingContext routingContext;
    private Exception exception;

    public RoutingContext getRoutingContext() {
        return routingContext;
    }

    public void setRoutingContext(RoutingContext routingContext) {
        this.routingContext = routingContext;
    }

    public Exception getException() {
        return exception;
    }

    public void setException(Exception exception) {
        this.exception = exception;
    }
}