package com.cubetiqs.data.domain;

import org.springframework.data.domain.Persistable;

import java.io.Serializable;

/**
 * @author sombochea
 * @see Persistable
 * @since 1.o
 */
public interface BaseEntity<ID> extends Persistable<ID>, Serializable {
    void setId(ID id);
}
