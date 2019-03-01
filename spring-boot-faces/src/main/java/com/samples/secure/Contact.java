package com.samples.secure;

public class Contact {

	String name;
	String phone;
	private Contact contact;
	
	public static Contact builder() {
		return new Contact();
	}

	public Contact name(String string) {
		name = string;
		return this;
	}

	public Contact phone(String string) {
		phone = string;
		return this;
	}
	
	public Contact build() {
		return this;
	}

}
