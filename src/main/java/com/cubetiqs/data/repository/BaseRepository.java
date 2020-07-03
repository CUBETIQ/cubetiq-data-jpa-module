package com.cubetiqs.data.repository;

import com.cubetiqs.data.domain.Queryable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

/**
 * Base Repository
 *
 * @author sombochea
 * @see JpaRepository
 * @see NoRepositoryBean
 * @since 1.0
 */
@NoRepositoryBean
public interface BaseRepository<T, ID> extends JpaRepository<T, ID> {
    List<T> searchByQueryable(Queryable<T> queryable);
    Page<T> searchByQueryable(Queryable<T> queryable, Pageable pageable);
}
