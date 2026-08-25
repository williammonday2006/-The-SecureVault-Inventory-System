package com.securevault.exceptions;

import com.securevault.exceptions.InvalidItemValueException;

public class InvalidItemValueException extends Exception {
    public InvalidItemValueException(String message){
        super(message);
    }
}