package com.lizhihui.camile.app.basic.dao;

import com.lizhihui.camile.app.mybatis.entity.Inventory;
import com.lizhihui.camile.app.mybatis.entity.User;
import com.lizhihui.camile.app.mybatis.entity.UserCondition;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * Created by lizhihui on 01/07/2017.
 */
public interface Mapper<T,E> {

    int deleteByPrimaryKey(String uuid);


    int insert(T record);

    int insertSelective(T record);


    T selectByPrimaryKey(String uuid);


    int updateByPrimaryKeySelective(T record);


    int updateByPrimaryKey(T record);

    List<T> selectByExampleWithRowbounds(E example, RowBounds rowBounds);

    List<T> selectByExample(E example);

}
