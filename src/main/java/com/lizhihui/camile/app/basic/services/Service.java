package com.lizhihui.camile.app.basic.services;

/**
 * Created by lizhihui on 01/07/2017.
 *
 */
public interface Service<T,E,M> {

    T findByPrimaryKey(String UUID);

    boolean insert(T record);

}
