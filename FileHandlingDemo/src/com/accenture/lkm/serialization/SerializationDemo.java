package com.accenture.lkm.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		Employee e=new Employee(10001, "Amita", 67000, "Cricket");
		Employee.showOrg();
		e.display();
		//Serialization
		ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("seri.txt"));
		out.writeObject(e);//serialization
		System.out.println("Object convereted into stream of bytes successfully");
	}

}
