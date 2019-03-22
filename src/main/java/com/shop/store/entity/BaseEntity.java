package com.shop.store.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

/**
 * 类名:
 * 概要: 通用基类
 *
 * @version 1.00 (2019年03月22日)
 */
@Data
public class BaseEntity {
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate createDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate modifyDate;

    private Integer status;

    private Long createUser;

    private Integer modifyUser;

    private String remake;
}
