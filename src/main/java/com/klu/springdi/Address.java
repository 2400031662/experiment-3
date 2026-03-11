package com.klu.springdi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	@Value("Hostel3")
 String nname;
	@Value("103")
 int rno;
	public Address() {
		
	}
public Address(String nname, int rno) {
	super();
	this.nname = nname;
	this.rno = rno;
}
@Override
public String toString() {
	return "Address [nname=" + nname + ", rno=" + rno + "]";
}
 
}
