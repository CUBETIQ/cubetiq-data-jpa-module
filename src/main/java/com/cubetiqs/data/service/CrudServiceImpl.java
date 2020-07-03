package com.cubetiqs.data.service;

import com.cubetiqs.data.domain.BaseEntity;
import com.cubetiqs.data.repository.BaseRepository;

import java.util.List;

/**
 * Crud Service Impl
 *
 * @author sombochea
 * @since 1.0
 */
@NoServiceBean
public class CrudServiceImpl<T, ID extends BaseEntity<ID>> implements CrudService<T, ID> {
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
        T update = read(id);
        if (update == null) {
            return null;
        }
        return getRepository().save(entity);
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
    public BaseRepository<T, ID> getRepository() {
        throw new ServiceNotImplementException("service must be implement!");
    }
}
