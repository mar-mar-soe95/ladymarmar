package io.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ImageStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("/home/zisarknar/Pictures/Wallpapers/input.jpg");
		if(file.exists()) {
			try(FileInputStream input = new FileInputStream(file);FileOutputStream output = new FileOutputStream("/home/zisarknar/Pictures/Wallpapers/output.jpg")){
				int data;
				while((data = input.read()) != -1) {
					output.write(data);
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		else {
			System.out.println("File not found-");
			
		}
		
		
		System.out.println("Terminate.......");

	}

}
