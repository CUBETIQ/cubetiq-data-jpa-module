package com.cubetiqs.data.service;

import com.cubetiqs.data.domain.BaseEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.io.Serializable;
import java.util.List;

/**
 * Paging Crud Service Impl
 *
 * @author sombochea
 * @see CrudService
 * @see PagingCrudService
 * @see AbstractCrudServiceImpl
 * @since 1.0
 */
@NoServiceBean
public abstract class AbstractPagingCrudServiceImpl<T extends BaseEntity<ID>, ID extends Serializable>
        extends AbstractCrudServiceImpl<T, ID>
        implements PagingCrudService<T, ID> {
    @Override
    public Page<T> findAll(Pageable pageable) {
        return getRepository().findAll(pageable);
    }

    @Override
    public List<T> findAll(Sort sort) {
        return getRepository().findAll(sort);
    }
}
