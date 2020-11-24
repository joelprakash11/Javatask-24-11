package com.tls.wrapperclass;

public class PrimitiveCasting {

	public static void main(String[] args) {
		byte b=20; char ch='a'; short s=152;
		int i=22,o=65; double d=100.10;
		int a=(int)b;//explict
		float f=(float)s;
        double x=i;//implicit
        long l=(long)d;
        int c=ch;
        char ch1=(char)o;
        System.out.println(a);
        System.out.println(x);
        System.out.println(c);
        System.out.println(l);
        System.out.println(ch1);
        System.out.println(s);
	}

}
