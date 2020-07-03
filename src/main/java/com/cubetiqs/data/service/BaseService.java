package com.cubetiqs.data.service;

import com.cubetiqs.data.repository.BaseRepository;

/**
 * Base Service Repository
 *
 * @author sombochea
 * @since 1.0
 */
@NoServiceBean
public interface BaseService<T, ID> {
    /**
     * Get current entity repository
     *
     * @return BaseRepository | Whole entity repository
     * @see BaseRepository
     */
    BaseRepository<T, ID> getRepository();
}
