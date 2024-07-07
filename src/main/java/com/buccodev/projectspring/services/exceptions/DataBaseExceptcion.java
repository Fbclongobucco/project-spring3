package com.buccodev.projectspring.services.exceptions;

public class DataBaseExceptcion extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public DataBaseExceptcion(String msg) {
		super(msg);
	}
}
