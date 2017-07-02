package com.lizhihui.camile.app.basic.services;

import com.lizhihui.camile.app.basic.dao.Mapper;
import org.apache.ibatis.session.RowBounds;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by lizhihui on 01/07/2017.
 *
 */
public abstract class ServiceIMP<T, E, M  extends Mapper<T, E>> implements Service<T, E, M> {
    @Resource
    private M mapper;

    public T findByPrimaryKey(String UUID) {
        return this.mapper.selectByPrimaryKey(UUID);
    }

    public boolean insert(T record) {
        return this.mapper.insert(record) == 1;
    }

    public boolean update(T record) {
        return this.mapper.updateByPrimaryKeySelective(record) == 1;
    }

    public boolean delete(String UUID) {
        return this.mapper.deleteByPrimaryKey(UUID) == 1;
    }

    List<T> listBy(E example, RowBounds rowBounds) {
        return this.mapper.selectByExampleWithRowbounds(example, rowBounds);
    }

    List<T> listBy(E example) {
        return this.mapper.selectByExample(example);
    }










}
