package com.accenture.lkm;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterOperation {

	public static void main(String[] args)
	{
		
		FileWriter w=null;
		try
		{
		w = new FileWriter("data.txt",true);
		w.write("JAVA Programming is based on OOPs");
		w.flush(); //will flush the data explicitly to the file 
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
		}
		System.out.println("End of program");
	}

}
