package com.cubetiqs.data.domain;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Audit Details
 *
 * @author sombochea
 * @since 1.0
 */
@Embeddable
public class AuditDetails implements Serializable {
    private String createdBy;

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public AuditDetails() {
    }

    public AuditDetails(String createdBy) {
        this.createdBy = createdBy;
    }
}
