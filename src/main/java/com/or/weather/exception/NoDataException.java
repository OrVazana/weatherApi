package com.or.weather.exception;

import com.or.weather.api.ApiException;

public class NoDataException extends ApiException {
    private final int code;

    public NoDataException(int code, String msg) {
        super(code, msg);
        this.code = code;
    }

}
