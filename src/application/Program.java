package application;

import java.text.DateFormat;
import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
	
	
		Department obj = new Department(1, "teste");
		System.out.println(obj);

		Seller sl = new Seller(1, "lucas", "lucasvaz@gmail.com", new Date(), 3434.34, obj);
		
		System.out.println(sl);
		
	}

}
