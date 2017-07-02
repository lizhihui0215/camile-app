package com.lizhihui.camile.app.basic.controller;

import com.lizhihui.camile.app.basic.dao.Response;
import com.lizhihui.camile.app.basic.services.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * Created by lizhihui on 01/07/2017.
 *
 */
@RestController
abstract public class Controller<T, S extends Service> {

    private final S service;


    protected <T> Response<T> response() {
        return new Response<T>();
    }

    @Autowired
    public Controller(S service) {
        this.service = service;
    }

    /**
     * POST（CREATE）：在服务器新建一个资源。
     * @param obj 保存对象
     * @return 响应对象
     */
    @RequestMapping(method = RequestMethod.POST)
    public Response<T> create(@RequestBody T obj) {

        boolean success = this.service.insert(obj);

        Response<T> response = this.response();

        return response.setSuccess(success).setResults(obj).setMessage("保存成功！");
    }


    /**
     * 从服务器取出资源（一项或  多项（未实现））
     * @param uuid 主键唯一标识
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public Response<T> select(@RequestParam String uuid) {

        T obj = (T) this.service.findByPrimaryKey(uuid);

        Response<T> response = this.response();

        if (obj != null) {
            response.setSuccess(true).setResults(obj).setMessage("查询成功！");
        }else {
            response.setSuccess(false).setResults(null).setMessage("查询的对象不存在！");
        }

        return response;
    }

    /**
     * PUT（UPDATE）：在服务器更新资源（客户端提供改变后的完整资源）。
     * @param obj 更新对象
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public Response<T> update(@RequestBody T obj) {

        boolean success = this.service.updateByPrimaryKey(obj);

        Response<T> response = this.response();

        return response.setSuccess(success).setResults(obj).setMessage(success ? "更新成功！" : "更新失败");
    }


    /**
     * PATCH（UPDATE）：在服务器更新资源（客户端提供改变的属性）。
     * @param obj 更新对象
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public Response<T> updateSelective(@RequestBody T obj) {

        boolean success = this.service.updateByPrimaryKeySelective(obj);

        Response<T> response = this.response();

        return response.setSuccess(success).setResults(obj).setMessage(success ? "更新成功！" : "更新失败");
    }

    /**
     * DELETE（DELETE）：从服务器删除资源。
     * @param uuid 主键唯一标识
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public Response<String> delete(@RequestParam String uuid) {

        boolean success = this.service.deleteByPrimaryKey(uuid);

        Response<String> response = this.response();

        return response.setSuccess(success).setResults(uuid).setMessage(success ? "删除成功！" : "删除失败");
    }

//    http://www.ruanyifeng.com/blog/2014/05/restful_api.html

//    HEAD：获取资源的元数据。
//    OPTIONS：获取信息，关于资源的哪些属性是客户端可以改变的。

//    GET /zoos：列出所有动物园
//    POST /zoos：新建一个动物园
//    GET /zoos/ID：获取某个指定动物园的信息
//    PUT /zoos/ID：更新某个指定动物园的信息（提供该动物园的全部信息）
//    PATCH /zoos/ID：更新某个指定动物园的信息（提供该动物园的部分信息）
//    DELETE /zoos/ID：删除某个动物园
//    GET /zoos/ID/animals：列出某个指定动物园的所有动物
//    DELETE /zoos/ID/animals/ID：删除某个指定动物园的指定动物




}
