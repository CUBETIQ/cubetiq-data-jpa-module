package com.cubetiqs.data.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * Base Domain Model
 *
 * @author sombochea
 * @see BaseEntity
 * @since 1.0
 */
@MappedSuperclass
public abstract class BaseDomainModel<ID extends Serializable> implements BaseEntity<ID> {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private ID id;

    @Override
    public void setId(ID id) {
        this.id = id;
    }

    @Override
    public ID getId() {
        return id;
    }

    @Override
    public boolean isNew() {
        return id == null;
    }
}
