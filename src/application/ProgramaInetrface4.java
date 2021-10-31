package application;

import devices.Printer;
import devices.Scanner;

public class ProgramaInetrface4 {

	public static void main(String[] args) {
		
		Printer p = new Printer("1060");
		p.processDoc("My Letter");
		p.print("My Letter");
		
		Scanner s = new Scanner("2003");
		s.processDoc("My Email");
		System.out.println("Scan Result: " + s.scan());

	}

}
