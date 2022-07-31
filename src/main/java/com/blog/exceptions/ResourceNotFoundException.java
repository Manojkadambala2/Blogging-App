package com.blog.exceptions;

public class ResourceNotFoundException extends RuntimeException{
	private String resource;
	private String field;
	private long fieldValue;
	public ResourceNotFoundException(String resource, String field, long fieldValue) {
		super(String.format("%s is not found of %s for : %l", resource, field, fieldValue));
		this.resource = resource;
		this.field = field;
		this.fieldValue = fieldValue;
	}
	
	
}
