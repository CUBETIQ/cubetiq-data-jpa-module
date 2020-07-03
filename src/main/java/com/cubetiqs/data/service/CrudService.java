package com.cubetiqs.data.service;

import java.util.List;

/**
 * Crud Service used for Create, Read, Update and Delete entity
 *
 * @author sombochea
 * @see BaseService
 * @since 1.0
 */
@NoServiceBean
public interface CrudService<T, ID> extends BaseService<T, ID> {
    /**
     * Find all entities
     *
     * @return List | Collection of Entity
     */
    List<T> findAll();

    /**
     * Create new record
     *
     * @param entity T
     * @return T | Get entity back
     */
    T create(T entity);

    /**
     * Create all entity records
     *
     * @param entities List of entities
     * @return List | Collection of entity
     */
    List<T> createAll(List<T> entities);

    /**
     * Read one record from entity ID
     *
     * @param id ID
     * @return T | If have, Get entity back or NULL
     */
    T read(ID id);

    /**
     * Update entity record with entity ID
     *
     * @param id     ID
     * @param entity T
     * @return T | Get entity back, after updated
     */
    T update(ID id, T entity);

    /**
     * Delete entity record with entity ID
     *
     * @param id ID
     */
    void delete(ID id);

    /**
     * Delete all entity records
     *
     * @param ids List of IDs
     */
    void deleteAll(List<ID> ids);
}
