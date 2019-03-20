package com.shop.store.service.impl;

import com.shop.store.entity.Comdity;
import com.shop.store.repository.CommodityRepository;
import com.shop.store.repository.page.PageCommodityRepository;
import com.shop.store.service.CommodityService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 类名:
 * 概要:
 *
 * @author zbx
 * @version 1.00 (2019年02月28日)
 */
@Service
public class CommodityServiceImpl implements CommodityService {
    @Resource
    private CommodityRepository commodityRepository;

    @Resource
    private PageCommodityRepository pageCommodityRepository;

    @Override
    public void saveCommodity(Comdity comdity) {
        commodityRepository.save(comdity);
    }

    @Override
    public void delCommodityById(Long id) {
        commodityRepository.deleteById(id);
    }

    @Override
    public void updCommodity(Comdity comdity) {
        commodityRepository.save(comdity);
    }

    @Override
    public Comdity queryCommdityById(Long id) {
        return commodityRepository.findByComdityId(id);
    }

    @Override
    public Page<Comdity> findAllEmployeeByPage(Integer pageStart, Integer pageEnd) {
        return pageCommodityRepository.findAll(PageRequest.of(pageStart, pageEnd));
    }
}
