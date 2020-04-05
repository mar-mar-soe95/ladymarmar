package io.stream;

import java.io.FileReader;
import java.io.FileWriter;

public class CharacterStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileReader fr =new FileReader("input.txt"); FileWriter fw =new FileWriter("charStreamOutput.txt")){
			int data;
			while((data = fr.read()) != -1) {
				fw.write(data);
			}
			System.out.println("Terminated");
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
