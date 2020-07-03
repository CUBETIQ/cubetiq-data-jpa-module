package com.cubetiqs.data.config;

import com.cubetiqs.data.repository.BaseRepositoryImpl;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Persistence Configuration Context.
 * This identifier used for boot config and app base packages and repositories bean.
 * Default scan components are "com.cubetiqs" and "com.cubetiqs.data.repository" for current base repository registration.
 *
 * @author sombochea
 * @see Target
 * @see Retention
 * @see Configuration
 * @see EnableJpaRepositories
 * @see EnableTransactionManagement
 * @see BaseRepositoryImpl
 * @since 1.0
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Configuration
@EnableJpaRepositories(
        basePackages = {"com.cubetiqs.data.repository", "com.cubetiqs"},
        repositoryBaseClass = BaseRepositoryImpl.class
)
@EnableTransactionManagement
public @interface PersistenceContext {
}
