package com.artsiomshshshsk.fooddelivery.exceptions;

public class LowBalanceException extends RuntimeException{
    public LowBalanceException(String message){
        super(message);
    }
}
