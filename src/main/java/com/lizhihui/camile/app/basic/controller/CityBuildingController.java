package com.lizhihui.camile.app.basic.controller;

import com.lizhihui.camile.app.basic.service.city.building.CityBuildingService;
import com.lizhihui.camile.app.mybatis.entity.CityBuilding;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by lizhihui on 07/05/2017.
 */

@Controller
@RequestMapping("/city/building")
public class CityBuildingController {

    private final CityBuildingService cityBuildingService;

    @Autowired
    public CityBuildingController(CityBuildingService cityBuildingService) {
        this.cityBuildingService = cityBuildingService;
    }

    @RequestMapping("/test")
    @ResponseBody
    public List<CityBuilding> test(){
        List<CityBuilding> cityBuildings = this.cityBuildingService.allCitys();

        return cityBuildings;
    }

}
