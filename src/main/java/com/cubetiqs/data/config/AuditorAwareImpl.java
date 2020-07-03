package com.cubetiqs.data.config;

import com.cubetiqs.data.domain.AuditDetails;
import org.springframework.data.domain.AuditorAware;
import org.springframework.lang.NonNull;

import java.util.Optional;

/**
 * Audit Aware Impl
 *
 * @author sombochea
 * @see AuditorAware
 * @see AuditDetails
 * @since 1.0
 */
public class AuditorAwareImpl implements AuditorAware<AuditDetails> {
    private final static String SYSTEM = "admin";

    @NonNull
    @Override
    public Optional<AuditDetails> getCurrentAuditor() {
        return Optional.of(new AuditDetails(SYSTEM));
    }
}
