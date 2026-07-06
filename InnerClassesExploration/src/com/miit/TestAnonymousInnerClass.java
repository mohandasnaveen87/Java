package com.miit;

interface Engine{
	void start();
}

public class TestAnonymousInnerClass {
public static void main(String[] args) {
	Engine eng=new Engine() {

		@Override
		public void start() {
			// TODO Auto-generated method stub
			System.out.println("I am an anonymous engine");
		}
		
	 
	};
	eng.start();
}}

