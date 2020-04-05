package object.stream;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serializable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee("Mg MG", 5, 100000);
		try (ObjectOutputStream output =new ObjectOutputStream(new FileOutputStream("emp.obj"))){
			output.writeObject(emp);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("Successfully saved");

	}

}
