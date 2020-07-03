package com.cubetiqs.data.service;

/**
 * Service not implement exception
 *
 * @author sombochea
 * @see RuntimeException
 * @since 1.0
 */
public class ServiceNotImplementException extends RuntimeException {
    public ServiceNotImplementException() {
    }

    public ServiceNotImplementException(String message) {
        super(message);
    }

    public ServiceNotImplementException(String message, Throwable cause) {
        super(message, cause);
    }

    public ServiceNotImplementException(Throwable cause) {
        super(cause);
    }

    public ServiceNotImplementException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
