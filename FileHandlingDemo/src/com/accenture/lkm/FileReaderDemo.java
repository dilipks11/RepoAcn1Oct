package com.accenture.lkm;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException 
	{
		FileReader r=new FileReader("C:\\Users\\kausar.khan\\abc.txt");
		int c=0;
		int count=0;
		while((c=r.read())!=-1)
		{
			System.out.print(""+(char)c);
			count++;
		}
		System.out.println();
		System.out.println("Total number of characters: "+count);
	}

}
