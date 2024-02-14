package com.kn.files;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;

public class DemoInputOutput {

	public static void main(String[] args) {
		//Input from user and write into the file
		String path = "C:\\Users\\hp\\OneDrive\\Desktop\\io\\output.txt";
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		
		int input = scan.nextInt();
		try {
			
			FileWriter fw = new FileWriter(path);
			fw.write(Integer.toString(input));
			fw.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//Input from file and write in console
		try {
			FileReader fr=new FileReader(path);
			BufferedReader br=new BufferedReader(fr);
			String x=br.readLine();
			System.out.print("Data from the file "+x);
			fr.close();
		}
		catch(Exception e)
		{
			
		}
		
		scan.close();
	}

}
