package com.kn.files;

import java.io.BufferedReader;
import java.io.FileReader;
public class DemoInputOutputArrayOfElements {

	public static void main(String[] args) {
		//Input from file and write on console
		String path="C:\\Users\\hp\\OneDrive\\Desktop\\io\\input.txt";
		try {
			FileReader fr=new FileReader(path);
			BufferedReader br=new BufferedReader(fr);
			String x;
			while((x=br.readLine())!=null)
			{
				System.out.println(x+" ");
				
			}
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
