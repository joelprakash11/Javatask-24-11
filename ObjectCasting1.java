package com.tls.wrapperclass;

class ObjectCasting1 {
int x=10;
void m1() {
	System.out.println("Casting 1");
}
}

class ObjectCasting2 extends ObjectCasting1{
int y=20;
void m2() {
	System.out.println("Casting 2");
}
}

class ObjectCasting3 extends ObjectCasting2 {
int z=30;
void m3() {
	System.out.println("Casting 3");
}
}

 

	
	 