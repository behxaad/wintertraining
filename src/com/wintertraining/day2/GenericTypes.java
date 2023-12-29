package com.wintertraining.day2;

public class GenericTypes {
	
	public static void main(String[] args) {
		
		MyGenericClass<String> mygen = new MyGenericClass();
		mygen.setValue("Muneesa");
		
	}

}

class MyGenericClass<T>
{
	Object obj;
	//or T obj
	public void setValue(T obj)
	{	
		this.obj = obj;
		System.out.println(this.obj);
	}
}
