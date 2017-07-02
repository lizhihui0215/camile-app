package com.lizhihui.camile.app.user.services;

import com.lizhihui.camile.app.basic.services.ServiceIMP;
import com.lizhihui.camile.app.mybatis.client.UserMapper;
import com.lizhihui.camile.app.mybatis.entity.User;
import com.lizhihui.camile.app.mybatis.entity.UserCondition;

/**
 * Created by lizhihui on 01/07/2017.
 *
 */
public class UserServicesIMPL  extends ServiceIMP<User,UserCondition,UserMapper> implements UserServices  {


}
