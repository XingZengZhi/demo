package com.shop.store.controller;

import com.google.gson.Gson;
import com.shop.store.entity.Commodity;
import com.shop.store.repository.CommodityEsRepository;
import com.shop.store.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

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
    private CommodityEsRepository commodityEsRepository;

    @Resource
    private CommodityService commodityService;

    /**
     * 添加
     * @return
     */
    @PostMapping("add")
    public String add(Commodity commodity) {
        // commodityRepository.save(commodity);
        commodityService.saveCommodity(commodity);
        System.err.println("添加了一个商品");
        return "success";
    }

    /**
     * 删除
     * @return
     */
    @RequestMapping("delete")
    public String delete(String id) {
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
    public String update(Commodity commodity) {
        // commodityRepository.save(commodity);
        commodityService.updCommodity(commodity);
        System.err.println("update a obj");
        return "success";
    }
    /**
     * 查询
     * @return
     */
    @RequestMapping("query")
    public String query(String id) {
        // Commodity commodity = commodityRepository.queryEmployeeById(id);
        Commodity commodity = commodityService.queryCommdityById(id);
        if(commodity == null) {
            return "不存在该用户";
        }
        return new Gson().toJson(commodity);
    }

    /**
     * 分页查询
     * @return
     */
    @RequestMapping("queryAll/{pageStart}/{pageEnd}")
    public String queryAll(@PathVariable Integer pageStart, @PathVariable Integer pageEnd) {
        Page<Commodity> commodityPage = commodityService.findAllEmployeeByPage(pageStart, pageEnd);
        if(commodityPage.isEmpty()) {
            return "不存在用户";
        }
        return new Gson().toJson(commodityPage);
    }
}
