package com.lizhihui.camile.app.user.controller;

import com.lizhihui.camile.app.basic.controller.Controller;
import com.lizhihui.camile.app.basic.dao.Response;
import com.lizhihui.camile.app.mybatis.entity.User;
import com.lizhihui.camile.app.user.services.UserServices;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by lizhihui on 01/07/2017.
 *
 */
@RequestMapping("/user")
public class UserController extends Controller<User, UserServices> {

    public UserController(UserServices services) {
        super(services);
    }

}
