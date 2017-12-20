package com.springbootwelcom.util;

public enum Gender {
	M("M"),F("F");
	 private Gender(String value){
		 this.value = value;
	 }
    private String value;
	private String getValue(){
		return value;
	}
}
