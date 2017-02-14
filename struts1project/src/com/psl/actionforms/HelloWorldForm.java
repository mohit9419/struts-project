package com.psl.actionforms;

import org.apache.struts.action.ActionForm;



public class HelloWorldForm extends ActionForm {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5288339727767960503L;

	private  String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
	
}
