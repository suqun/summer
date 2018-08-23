package org.summerframework.model;

import java.lang.reflect.InvocationTargetException;

public abstract class Summer<R> {
    private transient Object context;
    private transient R result;

    public R sum(){ return null; }

    public R baseSum(){
        try {
            Call.call(this);
            return this.getResult();
        } catch (InvocationTargetException | IllegalAccessException | ClassNotFoundException | NoSuchMethodException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    public <T extends Summer> T inst(Class<T> cls){
        try {
            T t = cls.newInstance();
            t.setContext(context);
            return t;
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    public R getResult() {
        return result;
    }

    public void setResult(R result) {
        this.result = result;
    }

    public Object getContext() {
        return context;
    }

    public void setContext(Object context) {
        this.context = context;
    }
}
