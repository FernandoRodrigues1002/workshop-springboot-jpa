package com.nando.spring1.services.exceptions;

public class DatabaseException extends RuntimeException{
    
    public DatabaseException(String msg){
        super(msg);
    }
}
