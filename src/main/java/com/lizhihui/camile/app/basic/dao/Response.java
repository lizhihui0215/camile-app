package com.lizhihui.camile.app.basic.dao;

/**
 * Created by lizhihui on 01/07/2017.
 */
public class Response<T> {
    private boolean success;

    private String message;

    private T results;

    public Response() {
        this.success = true;
    }

    public boolean getSuccess() {
        return success;
    }

    public Response<T> setSuccess(boolean success) {
        if (success) { this.message = null; }
        this.success = success;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public Response<T> setMessage(String message) {
        this.message = message;
        return this;
    }

    public T getResults() {
        return results;
    }

    public Response<T> setResults(T results) {
        this.results = results;
        this.message = null;
        return this;
    }
}
