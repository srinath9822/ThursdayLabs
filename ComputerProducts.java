package com.labs;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class ComputerProducts {
	private String pid,pname,pdata;
	private double pprice;
	Scanner sc=new Scanner(System.in);
	void getData() {
		System.out.println("Enter product id");
		pid=sc.next();
		System.out.println("Enter product name");
		pname=sc.next();
		System.out.println("Enter product price");
		pprice=sc.nextDouble();
		pdata="\n"+"Product id is:"+pid+" ,name is:"+pname+" ,it cost: "+pprice+".Rs";
	}
	void saveData() throws IOException {
		String fileName="D:\\Details\\ProductDetails.txt";
		FileWriter fw=new FileWriter(fileName,true);
		fw.write(pdata);
		fw.close();
	}
	void readData() throws IOException {
		Path fileName = Path.of("D:\\Details\\ProductDetails.txt");
		String file_content=Files.readString(fileName);
		System.out.println(file_content);
	}
	public static void main(String [] args) throws IOException {
		ComputerProducts p1=new ComputerProducts();
		p1.getData();
		p1.saveData();
		p1.readData();
	}

}
