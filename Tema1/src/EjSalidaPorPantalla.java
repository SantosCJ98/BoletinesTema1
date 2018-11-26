
public class EjSalidaPorPantalla {

	public static void main(String[] args) {
		
		//Ejercicio 1
		
	int hundredone = 101;
	
	System.out.print("La letra n�mero " + hundredone + " es la :\t" + "\'" + (char)hundredone + "\'" + "\n"
			+ "El car�cter \'\\\' es:" +"\n"
			+ "\t\"especial\"\n");
	
	System.out.println("------------------------------------------------------");
	
		//Ejercicio 2
	
	int x=10, y=-10;
	
	float n=13.269834f;
	
	String cad="Ana";
	
	System.out.printf("%d \n", x);
	
	System.out.printf("+%d \n", x );
	
	System.out.printf("%d \n", y);
	
	System.out.printf("%.2f \n", n);
	
	System.out.printf("%+10.4f \n", n);
	
	System.out.printf("%9.4f \n", n);
	
	System.out.printf("%+010.3f \n", n);
	
	System.out.printf("n=%-8.2fx=%d \n", n, x);
	
	System.out.printf("%8s%s%5s\n", cad, cad, cad);
	
	//Ejercicio 3
	
	System.out.println("-----------------------------------------------------");
	
	char heart = '\u2764', umbrella = '\u2602', phone = '\u260E', horse = '\u265E';
	
	System.out.printf("%-7c%-7c%-7c%-7c", heart, umbrella, phone, horse);
	
	
	
	}

}
