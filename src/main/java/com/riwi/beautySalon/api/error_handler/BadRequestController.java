package com.riwi.beautySalon.api.error_handler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.riwi.beautySalon.api.dto.errors.BaseErrorResp;

@RestControllerAdvice
@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class BadRequestController {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public BaseErrorResp handlBadRequest(MethodArgumentNotValidException exception){
        List <Map<String,String>> errors = new ArrayList<>();

        exception.getBindingResult().getFieldErrors().forEach(fiel ->{
            Map<String, String> error = new HashMap<>();
            error.put("error", fiel.getDefaultMessage());
            error.put("fiel", fiel.getField());
            errors.add(error);

        });
        
        return;
    }
}

