package com.example.exceptions;

public class ResourceNotFoundException extends RuntimeException {

	String resourceName;
	String filedName;
	int filedValue;

	public ResourceNotFoundException(String resourceName, String filedName, int filedValue) {
		super(String.format("%s not found with %s : %l", resourceName, filedName, filedValue));
		this.resourceName = resourceName;
		this.filedName = filedName;
		this.filedValue = filedValue;
	}

	public String getResourceName() {
		return resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	public String getFiledName() {
		return filedName;
	}

	public void setFiledName(String filedName) {
		this.filedName = filedName;
	}

	public int getFiledValue() {
		return filedValue;
	}

	public void setFiledValue(int filedValue) {
		this.filedValue = filedValue;
	}

	@Override
	public String toString() {
		return "ResourceNotFoundException [resourceName=" + resourceName + ", filedName=" + filedName + ", filedValue="
				+ filedValue + "]";
	}

}