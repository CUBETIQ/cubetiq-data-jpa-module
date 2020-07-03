package com.cubetiqs.data.config;

import com.cubetiqs.data.domain.AuditDetails;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.AuditorAware;

/**
 * Auditor Aware Configurer
 *
 * @author sombochea
 * @see AuditorAware
 * @see AuditDetails
 * @since 1.0
 */
public interface AuditorAwareConfigurer {
    String AUDITOR_AWARE_BEAN = "auditorAware";

    @Bean
    default AuditorAware<AuditDetails> auditorAware() {
        return new AuditorAwareImpl();
    }
}
