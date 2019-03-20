package com.shop.store.entity;

import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * 类名:
 * 概要:
 * shards 默认分区数
 * replicas 每个分区默认的备份数
 * refreshInterval 刷新间隔
 * @author xzz
 * @version 1.00 (2019年03月20日)
 */
@Entity
@Table(name = "commodity")
@Data
@Document(indexName = "store", type = "commodity", shards = 1, replicas = 0, refreshInterval = "-1")
public class Comdity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private BigDecimal price;

    private String about;

    @Column(nullable = false)
    private Long cid;

    @Column(nullable = false)
    private Long count;

    private Long sales;

    private String remake;
}
