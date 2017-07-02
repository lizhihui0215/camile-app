package com.lizhihui.camile.app.basic.controller;

import com.lizhihui.camile.app.basic.dao.Response;
import com.lizhihui.camile.app.basic.services.Service;
import com.lizhihui.camile.app.mybatis.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by lizhihui on 01/07/2017.
 *
 */
@RestController
abstract public class Controller<T, S extends Service> {

    public final S services;


    public <T> Response<T> response() {
        return new Response<T>();
    }

    @Autowired
    public Controller(S services) {
        this.services = services;
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Response<T> save(@RequestBody T obj) {

        boolean success = this.services.insert(obj);

        Response<T> response = this.response();

        return response.setSuccess(success).setResults(obj).setMessage("保存成功！");
    }


}
