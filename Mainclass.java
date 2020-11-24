package com.tls.wrapperclass;

public class Mainclass {
	public static void main(String[] args) {
		//upcasting 
	ObjectCasting1 o1=new ObjectCasting2();
	ObjectCasting3 o3=new ObjectCasting3();
	 o3.m1();
	 System.out.println(o3.x);
	 o3.m2();
	 System.out.println(o3.y);
	 o3.m3();
	 System.out.println(o3.z);
	} 
	
	    //downcasting-only upcasted can be downcasted always explict
		//ObjectCasting2 o2= (ObjectCasting2)new ObjectCasting1();
	//o2.m1();
    
	
}

