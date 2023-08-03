package com.satishgupta.blog_app.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResoucreNotFoundException extends RuntimeException {
    String resourceName;
    String fieldName;
    long fieldValue;
   
    public ResoucreNotFoundException(String resourceName, String fieldName, long fieldValue) {
        super(String.format("%s not found with %s : %l", resourceName, fieldName, fieldValue));
        this.resourceName = resourceName;
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
    }
}
