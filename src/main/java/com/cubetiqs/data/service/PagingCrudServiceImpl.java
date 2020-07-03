package com.cubetiqs.data.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

/**
 * Paging Crud Service Impl
 *
 * @author sombochea
 * @see CrudService
 * @see PagingCrudService
 * @see CrudServiceImpl
 * @since 1.0
 */
@NoServiceBean
public class PagingCrudServiceImpl<T, ID> extends CrudServiceImpl<T, ID> implements PagingCrudService<T, ID> {
    @Override
    public Page<T> findAll(Pageable pageable) {
        return getRepository().findAll(pageable);
    }

    @Override
    public List<T> findAll(Sort sort) {
        return getRepository().findAll(sort);
    }
}
