package aa.cc;
//package aa.bb;

import aa.bb.A;

class AUser extends A
{
	AUser(){
		super(); //new A(); //protected
		System.out.println(i); //protected
		m(); //protected
	}
	public static void main(String[] args) 
	{
		new AUser();
	}
}