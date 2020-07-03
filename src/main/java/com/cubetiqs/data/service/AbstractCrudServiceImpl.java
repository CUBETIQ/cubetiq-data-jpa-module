package com.cubetiqs.data.service;

import com.cubetiqs.data.domain.BaseEntity;

import java.io.Serializable;
import java.util.List;

/**
 * Crud Service Impl
 *
 * @author sombochea
 * @since 1.0
 */
@NoServiceBean
public abstract class AbstractCrudServiceImpl<T extends BaseEntity<ID>, ID extends Serializable> implements CrudService<T, ID> {
    @Override
    public List<T> findAll() {
        return getRepository().findAll();
    }

    @Override
    public T create(T entity) {
        return getRepository().save(entity);
    }

    @Override
    public List<T> createAll(List<T> entities) {
        return getRepository().saveAll(entities);
    }

    @Override
    public T read(ID id) {
        return getRepository().findById(id).orElse(null);
    }

    @Override
    public T update(ID id, T entity) {
        if (existsById(id)) {
            entity.setId(id);
            return getRepository().save(entity);
        }
        return null;
    }

    @Override
    public void delete(ID id) {
        getRepository().deleteById(id);
    }

    @Override
    public void deleteAll(List<ID> ids) {
        getRepository().deleteAll(getRepository().findAllById(ids));
    }

    @Override
    public boolean existsById(ID id) {
        return getRepository().existsById(id);
    }
}
