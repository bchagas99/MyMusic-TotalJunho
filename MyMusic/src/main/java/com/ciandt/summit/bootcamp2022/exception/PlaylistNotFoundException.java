package com.ciandt.summit.bootcamp2022.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class PlaylistNotFoundException extends RuntimeException{
    public PlaylistNotFoundException(String message) {
        super(message);
    }
}
