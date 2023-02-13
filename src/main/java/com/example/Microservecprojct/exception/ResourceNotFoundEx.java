package com.example.Microservecprojct.exception;

public class ResourceNotFoundEx extends RuntimeException{

    public ResourceNotFoundEx(){
        super("resouce not  Found on server!");
    }
    public ResourceNotFoundEx(String msg){
        super(msg);
    }
}
