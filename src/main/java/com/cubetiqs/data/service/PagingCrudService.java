package com.cubetiqs.data.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

/**
 * Paging Crud Service
 * Used for Crud Style, but include pagination support
 *
 * @author sombochea
 * @see CrudService
 * @since 1.0
 */
@NoServiceBean
public interface PagingCrudService<T, ID> extends CrudService<T, ID> {
    /**
     * Find All with pagination
     *
     * @param pageable Pageable
     * @return Page | Page of entity
     * @see Pageable
     */
    Page<T> findAll(Pageable pageable);

    /**
     * Find All with pagination and sort
     *
     * @param sort Sort
     * @return List | Collection of entity that sorted
     * @see Sort
     */
    List<T> findAll(Sort sort);
}
