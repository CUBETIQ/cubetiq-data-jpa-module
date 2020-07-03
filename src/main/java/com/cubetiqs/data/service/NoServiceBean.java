package com.cubetiqs.data.service;

import org.springframework.data.repository.NoRepositoryBean;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * No Service Bean
 *
 * @author sombochea
 * @see NoRepositoryBean
 * @since 1.0
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@NoRepositoryBean
public @interface NoServiceBean {
    String value() default "";
}
