package com.java_oops_15thApril_2023;

public class Dummy extends Concept_abstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Concept_abstr ref = new Dummy();
		ref.logic();
		ref.world();
	}

	//now we have to create body of unimplemented methods from parent abstract class
	//we can also add parameters in overriding method = me can overload them
	@Override
	public void sample() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void world() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void logic(int i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void logic() {
		// TODO Auto-generated method stub
		
	}

	Concept_abstr ref = new Dummy();
	
	
}
