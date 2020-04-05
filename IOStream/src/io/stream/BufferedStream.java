package io.stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class BufferedStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(BufferedReader br = new BufferedReader(new FileReader("input.txt"));PrintWriter pw =new PrintWriter(new FileWriter("buffered.txt"))) {
			String line;
			int count =0;
			while((line = br.readLine()) != null) {
				pw.println(line);
				count++;
				
			}
			System.out.println("Count=>" + count);
				
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	 

	}

}
