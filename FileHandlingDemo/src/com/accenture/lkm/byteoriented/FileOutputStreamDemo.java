package com.accenture.lkm.byteoriented;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) throws IOException
	{
		FileOutputStream out=new FileOutputStream("data.txt",true);
		//byte [] b= {65,66,89};//can write byte array
		String str="FILE HANDLING";
		byte [] b=str.getBytes();//will convert the string into array of bytes
		out.write(b);
		System.out.println("end of program");
		
	}

}
