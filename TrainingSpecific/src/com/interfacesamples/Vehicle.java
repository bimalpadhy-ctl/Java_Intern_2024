package com.interfacesamples;

public interface Vehicle{
String getBrand();
String speedUp();
String slowDown();
default String turnAlarmOn()

	 { return "Turning the vehicle alarm on."; }
}

