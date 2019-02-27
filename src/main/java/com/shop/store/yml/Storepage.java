package com.shop.store.yml;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * 类名:
 * 概要: 页面路径配置类。对应yml配置
 *
 * @author xzz
 * @version 1.00 (2019年02月26日)
 */
@Component
@ConfigurationProperties(prefix = "storepage")
public class Storepage {
    private Map<String, String> pagemap;

    public Map<String, String> getPagemap() {
        return pagemap;
    }

    public void setPagemap(Map<String, String> pagemap) {
        this.pagemap = pagemap;
    }
}
