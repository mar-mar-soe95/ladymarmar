package io.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileInputStream input =new FileInputStream("input.txt");FileOutputStream output=new FileOutputStream("output.txt")) {
			int data;
			while((data=input.read()) != -1) {
				output.write(data);
				
			}
			output.write(97);
			output.write(97);
			output.write(97);
			
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		System.out.println("Terminate....");

	}

}
