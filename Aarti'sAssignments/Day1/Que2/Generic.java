package com.eg;

import com.eg.Test;
import com.eg.Test2;

class Test<A>
{
	A a;
	
	Test(A ob1)
	{
		a = ob1;
	}
	
	A getOb()
	{
		return a;
	}
}

class Test2<A, B> extends Test<A>
{
	B b;
	Test2(A ob1, B ob2)
	{
		super(ob1);
		b = ob2;
	}
	
	B getOb2()
	{
		return b;
	}
}


public class Generic {
	public static void main(String[] args) {
		Test2<Integer, String> t = new Test2<Integer, String>(101, "Aarti");
		
		System.out.println(t.getOb());
		System.out.println(t.getOb2());
	}
	
}
