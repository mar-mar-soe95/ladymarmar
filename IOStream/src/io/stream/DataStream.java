package io.stream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		invalidInput();

	}
	static void output() {
		String[] fruits = {"apple","orange","mango"};
		double[] prices = { 800,600,500};
		int[] quantities = {4,5,6};
		
		try (DataOutputStream out =new DataOutputStream(new FileOutputStream("data-output.txt"))){
			for(int i=0; i< fruits.length; i++) {
				out.writeUTF(fruits[i]);
				out.writeDouble(prices[i]);
				out.writeInt(quantities[i]);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
	}
	static void validInput() {
		try (DataInputStream input= new DataInputStream(new FileInputStream("data-output.txt"))){
			int i =0;
			while(i >=0) {
				System.out.printf(
						"Name : %s Price : %.2f Quantity : %d",
						input.readUTF(),
						input.readDouble(),
						input.readInt());
				i++;
			}
			
		} 
		catch(EOFException e) {
			System.out.println("End of file");
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	static void invalidInput() {
		try (DataInputStream input= new DataInputStream(new FileInputStream("data-output.txt"))){
			int i =0;
			while(i >=0) {
				System.out.printf(
						"Name : %s Price : %d Quantity : %d",
						input.readUTF(),
						input.readInt(),
						input.readDouble());
				i++;
			}
			
		} 
		catch(EOFException e) {
			System.out.println("End of file");
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
