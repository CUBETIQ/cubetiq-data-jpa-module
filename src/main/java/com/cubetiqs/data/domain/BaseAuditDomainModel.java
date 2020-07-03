package com.cubetiqs.data.domain;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Base Domain Model
 *
 * @author sombochea
 * @see BaseEntity
 * @since 1.0
 */
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseAuditDomainModel<ID extends Serializable> extends BaseDomainModel<ID> {
    @Embedded
    @AttributeOverride(
            name = "createdBy",
            column = @Column(name = "created_by")
    )
    @CreatedBy
    private AuditDetails createdBy;

    @CreatedDate
    private Date createdDate;

    @Embedded
    @AttributeOverride(
            name = "createdBy",
            column = @Column(name = "updated_by")
    )
    @LastModifiedBy
    private AuditDetails updatedBy;

    @LastModifiedDate
    private Date updatedDate;
}
