//1st package
package pck1;

 class A {
	protected void run()
	{
		System.out.println("run");
	}
}
 
 
//Sub-package
 package pck1.sp2;

 import pck1.A;

 public class C extends A {

 	public static void main(String[] args) {
 		C c=new C();
 		c.run();
 	}
 }

 
//2nd package
 package pck2;

 import pck1.*;

 public class B extends A{
 	public static void main(String[] args) {
 		B b = new B();
 		b.run();
 	}
 }
