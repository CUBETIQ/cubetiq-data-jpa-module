package com.cubetiqs.data.repository;

import com.cubetiqs.data.domain.Queryable;
import com.cubetiqs.logging.Log;
import org.apache.logging.log4j.Logger;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import javax.persistence.EntityManager;
import java.io.Serializable;
import java.util.List;

/**
 * Base Repository Impl
 *
 * @author sombochea
 * @see BaseRepository
 * @see SimpleJpaRepository
 * @since 1.0
 */
@NoRepositoryBean
public class BaseRepositoryImpl<T, ID extends Serializable>
        extends SimpleJpaRepository<T, ID>
        implements BaseRepository<T, ID> {
    private final Logger logger = Log.getLogger(getClass());

    public BaseRepositoryImpl(JpaEntityInformation<T, ?> entityInformation, EntityManager entityManager) {
        super(entityInformation, entityManager);
    }

    @Override
    public List<T> searchByQueryable(Queryable<T> queryable) {
        List<T> records = findAll(queryable);
        logger.info("find all records: {}", records.size());
        return records;
    }

    @Override
    public Page<T> searchByQueryable(Queryable<T> queryable, Pageable pageable) {
        Page<T> records = findAll(queryable, pageable);
        logger.info("find all records: {} and pages: {}", records.getTotalElements(), records.getTotalPages());
        return records;
    }
}
