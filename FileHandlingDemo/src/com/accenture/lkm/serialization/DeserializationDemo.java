package com.accenture.lkm.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException 
	{
		Employee e=null;
		ObjectInputStream in=new ObjectInputStream(new FileInputStream("seri.txt"));
		e=(Employee) in.readObject();//deserialization
		e.display();

	}

}
