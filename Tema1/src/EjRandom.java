import java.util.Random;

public class EjRandom {

	public static void main(String[] args) {
		
		// 1) La cara de una moneda
		
		Random coin = new Random();
		
		System.out.println(coin.nextBoolean() == true ? "Moneda: Cara" : "Moneda: Cruz");
		
		System.out.println("------------------------------------------------------------");
		
		// 2) Lanzamiento de un dado
		
		Random dice = new Random();
		
		System.out.println("Dado: " + (dice.nextInt(6)+1));
		
		System.out.println("------------------------------------------------------------");
		
		// 3) Número entre 34 y 68
		
		Random number = new Random();
		
		System.out.println("Número aleatorio entre 34 y 68: " + (number.nextInt(68-34+1)+34));
		
		System.out.println("------------------------------------------------------------");
		
		// 4) Número decimal
		
		Random decimal = new Random();
		
		System.out.println("Número decimal aleatorio: " + decimal.nextDouble());
		
		System.out.println("------------------------------------------------------------");
		
		// 5) Un dia de la semana (Mostrar si es fin de semana)
		
		Random day = new Random();
		
		int d=day.nextInt(7)+1;
		
		String stringday = "";
		
		
		switch (d) {
		
		case 1: stringday = "Lunes";
		break;
		
		case 2: stringday = "Martes";
		break;
		
		case 3: stringday = "Miércoles";
		break;
		
		case 4: stringday = "Jueves";
		break;
		
		case 5: stringday = "Viernes";
		break;
		
		case 6: stringday = "Sábado";
		break;
		
		case 7: stringday = "Domingo";
		break;
		
		}
		
		System.out.println("Día de la semana: " + stringday);
		System.out.println((d == 6 || d == 7) ? "Es fin de semana" : "No es fin de semana");
		
		System.out.println("------------------------------------------------------------");
		
		// 6) Mes aleatorio (Mostrar si es verano)
		
		Random month = new Random();
		
		int m = month.nextInt(12)+1;
		
		String smonth = "";
		
		switch (m) {
		
		case 1: smonth = "Enero";
		break;
		
		case 2: smonth = "Febrero";
		break;
		
		case 3: smonth = "Marzo";
		break;
		
		case 4: smonth = "Abril";
		break;
		
		case 5: smonth = "Mayo";
		break;
		
		case 6: smonth = "Junio";
		break;
		
		case 7: smonth = "Julio";
		break;
		
		case 8: smonth = "Agosto";
		break;
		
		case 9: smonth = "Septiembre";
		break;
		
		case 10: smonth = "Octubre";
		break;
		
		case 11: smonth = "Noviembre";
		break;
		
		case 12: smonth = "Diciembre";
		break;
		}
		
		
		System.out.println("Mes aleatorio: " + smonth);
		System.out.println((m>=6 && m <=8) ? "Es verano" : "No es verano");
		
		}
		

	}


