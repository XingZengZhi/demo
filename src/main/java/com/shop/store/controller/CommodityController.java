package com.shop.store.controller;

import com.google.gson.Gson;
import com.shop.store.entity.Comdity;
import com.shop.store.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类名:
 * 概要: 关于商品的操作
 * CRUD操作、es搜索
 *
 * @author xzz
 * @version 1.00 (2019年02月27日)
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("commodity")
public class CommodityController {

    @Autowired
    private CommodityService commodityService;

    /**
     * 添加
     * @return
     */
    @PostMapping("add")
    public String add(Comdity comdity) {
        // commodityRepository.save(commodity);
        commodityService.saveCommodity(comdity);
        System.err.println("添加了一个商品");
        return "success";
    }

    /**
     * 删除
     * @return
     */
    @RequestMapping("delete")
    public String delete(Long id) {
        // Commodity commodity = commodityRepository.queryEmployeeById(id);
        // commodityRepository.delete(commodity);
        commodityService.delCommodityById(id);
        return "success";
    }

    /**
     * 局部更新
     * @return
     */
    @RequestMapping("update")
    public String update(Comdity comdity) {
        // commodityRepository.save(commodity);
        commodityService.updCommodity(comdity);
        System.err.println("update a obj");
        return "success";
    }
    /**
     * 查询
     * @return
     */
    @RequestMapping("query")
    public String query(Long id) {
        // Commodity commodity = commodityRepository.queryEmployeeById(id);
        Comdity comdity = commodityService.queryCommdityById(id);
        if(comdity == null) {
            return "不存在该用户";
        }
        return new Gson().toJson(comdity);
    }

    /**
     * 分页查询
     * @return
     */
    @RequestMapping("queryAll/{pageStart}/{pageEnd}")
    public String queryAll(@PathVariable Integer pageStart, @PathVariable Integer pageEnd) {
        Page<Comdity> commodityPage = commodityService.findAllEmployeeByPage(pageStart, pageEnd);
        if(commodityPage.isEmpty()) {
            return "不存在用户";
        }
        return new Gson().toJson(commodityPage);
    }
}
