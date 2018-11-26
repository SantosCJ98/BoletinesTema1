import java.util.Scanner;

public class EjScanner {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner (System.in);
		
		String name;
		
		String surname;
		
		int age;
		
		String street;
		
		int number;
		
		int postcode;
		
		String province;
		
		boolean student;
		
		double size;
		
		System.out.println("Introduzca su nombre:");
		
		name = keyboard.nextLine();
		
		System.out.println("--------------------------------------------");
		
		System.out.println("Introduzca sus apellidos:");
		
		surname = keyboard.nextLine();
		
		System.out.println("--------------------------------------------");
		
		System.out.println("Introduzca su edad:");
		
		age = Integer.parseInt(keyboard.nextLine());
		
		System.out.println("--------------------------------------------");
		
		System.out.println("Dirección (Calle)");
		
		street = keyboard.nextLine();
		
		System.out.println("--------------------------------------------");
		
		System.out.println("Dirección (Número)");
		
		number = Integer.parseInt(keyboard.nextLine());
		
		System.out.println("--------------------------------------------");
		
		System.out.println("Dirección (Provincia)");
		
		province = keyboard.nextLine();
		
		System.out.println("--------------------------------------------");
		
		System.out.println("Dirección (Código Postal)");
		
		postcode = Integer.parseInt(keyboard.nextLine());
		
		System.out.println("--------------------------------------------");
		
		System.out.println("¿Es usted estudiante? (Sí = true, No = false)");
		
		student = keyboard.nextBoolean();
		
		System.out.println("--------------------------------------------");
		
		System.out.println("Indique su altura. (Metros)");
		
		size = keyboard.nextDouble();
		
		System.out.println("--------------------------------------------");
		
		System.out.println("Te llamas " + name + surname + ", tienes " + age + "años, vives en " + street + " " + number + " " + province + " " + postcode + ", " + 
		((student == true) ? "eres estudiante, " : "no eres estudiante, ") + "y mides " + size + " metros.");
		
	}

}
