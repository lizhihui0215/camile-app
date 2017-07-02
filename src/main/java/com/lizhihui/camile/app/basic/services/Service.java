package com.lizhihui.camile.app.basic.services;

import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * Created by lizhihui on 01/07/2017.
 *
 */
public interface Service<T,E> {

    T findByPrimaryKey(String UUID);

    boolean insert(T record);

    public boolean updateByPrimaryKeySelective(T record);

    public boolean updateByPrimaryKey(T record);

    public boolean deleteByPrimaryKey(String UUID);

    List<T> listBy(E example, RowBounds rowBounds);

    List<T> listBy(E example);

}
