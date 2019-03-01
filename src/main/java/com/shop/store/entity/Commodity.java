package com.shop.store.entity;

import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import javax.persistence.Id;
import java.io.Serializable;

/**
 * 类名:
 * 概要: 商品基础信息类
 * shards 默认分区数
 * replicas 每个分区默认的备份数
 * refreshInterval 刷新间隔
 * @author xzz
 * @version 1.00 (2019年02月27日)
 */
@Document(indexName = "store", type = "commodity", shards = 1, replicas = 0, refreshInterval = "-1")
public class Commodity implements Serializable {
    @Id
    private String id;

    private String name;

    private String imgurl;

    private String cdate;

    private String mdate;

    private Integer cuser;

    private Integer muser;

    private String remake;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public String getCdate() {
        return cdate;
    }

    public void setCdate(String cdate) {
        this.cdate = cdate;
    }

    public String getMdate() {
        return mdate;
    }

    public void setMdate(String mdate) {
        this.mdate = mdate;
    }

    public Integer getCuser() {
        return cuser;
    }

    public void setCuser(Integer cuser) {
        this.cuser = cuser;
    }

    public Integer getMuser() {
        return muser;
    }

    public void setMuser(Integer muser) {
        this.muser = muser;
    }

    public String getRemake() {
        return remake;
    }

    public void setRemake(String remake) {
        this.remake = remake;
    }
}
