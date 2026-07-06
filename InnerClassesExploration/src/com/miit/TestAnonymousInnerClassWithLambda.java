package com.miit;

interface House{
	void lock();
}

public class TestAnonymousInnerClassWithLambda {
public static void main(String[] args) {
	House eng=()->System.out.println("House is locked");
	eng.lock();
}}

