package com.shop.store.entity;

import javax.persistence.*;

/**
 * 类名:
 * 概要: 界面资源类
 *
 * @author xzz
 * @version 1.00 (2019年02月25日)
 */

@Entity
@Table(name = "resource")
public class RoleResource {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String url;

    @Column(name = "res_name")
    private String resName;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getResName() {
        return resName;
    }

    public void setResName(String resName) {
        this.resName = resName;
    }
}
