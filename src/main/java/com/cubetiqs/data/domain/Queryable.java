package com.cubetiqs.data.domain;

import org.springframework.data.jpa.domain.Specification;

/**
 * Queryable Specification
 *
 * @author sombochea
 * @see Specification
 * @since 1.0
 */
public interface Queryable<T> extends Specification<T> {
}
