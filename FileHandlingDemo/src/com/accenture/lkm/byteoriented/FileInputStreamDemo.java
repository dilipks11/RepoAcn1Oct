package com.accenture.lkm.byteoriented;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo 
{

	public static void main(String[] args) throws IOException
	{
		FileInputStream in=new FileInputStream("data.txt"); //bye oriented
		int c=0;
		while((c=in.read())!=-1)
		{
		System.out.print(" "+(char)c);	
		}
		System.out.println();
		System.out.println("end of program");
	}

}
