package com.shop.store.entity;

import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

import javax.persistence.Id;

/**
 * 类名:
 * 概要: 商品基础信息类
 *
 * @author xzz
 * @version 1.00 (2019年02月27日)
 */
@Document(indexName = "store", type = "commodity", shards = 1, replicas = 0, refreshInterval = "-1")
public class Commodity {
    @Id
    private String id;
    @Field
    private String name;
    @Field
    private String imgurl;
    @Field
    private String cdate;
    @Field
    private String mdate;
    @Field
    private Integer cuser;
    @Field
    private Integer muser;
    @Field
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
