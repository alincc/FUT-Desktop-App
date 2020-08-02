package com.fut.desktop.app.exceptions;

import com.fut.desktop.app.domain.FutError;

public class BadRequestException extends FutErrorException{

    public BadRequestException(FutError futError, Exception e) {
        super(futError, e);
    }
}
