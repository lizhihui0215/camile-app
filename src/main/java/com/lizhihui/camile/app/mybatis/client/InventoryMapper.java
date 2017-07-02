package com.lizhihui.camile.app.mybatis.client;

import com.lizhihui.camile.app.basic.dao.Mapper;
import com.lizhihui.camile.app.mybatis.entity.Inventory;
import com.lizhihui.camile.app.mybatis.entity.InventoryCondition;
import java.util.List;
import org.apache.ibatis.session.RowBounds;

public interface InventoryMapper extends Mapper<Inventory, InventoryCondition> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CM_INVENTORY
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String uuid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CM_INVENTORY
     *
     * @mbggenerated
     */
    int insert(Inventory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CM_INVENTORY
     *
     * @mbggenerated
     */
    int insertSelective(Inventory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CM_INVENTORY
     *
     * @mbggenerated
     */
    List<Inventory> selectByExampleWithRowbounds(InventoryCondition example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CM_INVENTORY
     *
     * @mbggenerated
     */
    List<Inventory> selectByExample(InventoryCondition example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CM_INVENTORY
     *
     * @mbggenerated
     */
    Inventory selectByPrimaryKey(String uuid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CM_INVENTORY
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Inventory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CM_INVENTORY
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Inventory record);
}