package com.lizhihui.camile.app.basic.service.city.building;

import com.lizhihui.camile.app.mybatis.client.CityBuildingMapper;
import com.lizhihui.camile.app.mybatis.entity.CityBuilding;
import com.lizhihui.camile.app.mybatis.entity.CityBuildingExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by lizhihui on 07/05/2017.
 */
@Service
@Transactional
public class CityBuildingServiceImpl implements CityBuildingService {

    @Resource
    private CityBuildingMapper mapper;


    public List<CityBuilding> allCitys() {
        CityBuildingExample example = new CityBuildingExample();
        example.clear();
        return this.mapper.selectByExample(example);
    }
}
