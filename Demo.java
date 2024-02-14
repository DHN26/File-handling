package com.kn.files;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Demo {

	public static void main(String[] args) {
		try {
		String path1="C:\\Users\\hp\\OneDrive\\Desktop\\io\\input.txt";
		String path2="C:\\Users\\hp\\OneDrive\\Desktop\\io\\output.txt";
		
		FileInputStream fis=new FileInputStream(path1);
		FileOutputStream fos=new FileOutputStream(path2);
		
		int x;
		while((x=fis.read())!=-1)
		{
			fos.write(x);
		}
		fis.close();
		fos.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
