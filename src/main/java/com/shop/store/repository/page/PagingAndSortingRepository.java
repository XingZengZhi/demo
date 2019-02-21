package com.shop.store.repository.page;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;

/**
 * 类名:
 * 概要:分页repository
 *
 * @author xzz
 * @version 1.00 (2019年02月21日)
 */
public interface PagingAndSortingRepository<T, ID extends Serializable>
        extends CrudRepository<T, ID> {
    Iterable<T> findAll(Sort sort);

    Page<T> findAll(Pageable pageable);
}
