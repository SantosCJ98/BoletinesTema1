
public class EjercicioString {

	public static void main(String[] args) {
		
		String text = "Javaisfun!";
		String text1 ="javaisnotfun";
		String text2 ="javaisfun!";
		String text3 = "";
		
		//CharAt (Devuelve el caracter del índice especificado)
		
		System.out.println(text.charAt(4));
		
		//length (Longitud de la cadena)
		
		System.out.println(text.length());
		
		//equals (Comparar cadenas)
		
			// 2 cadenas
		
			System.out.println(text.equals(text1));
			
			//3 cadenas
			
			System.out.println(text.equals(text1) && text.equals(text2) && text1.equals(text2));
			
			//codePointat (Igual que charAt, pero devuelve el codigo Unicode.
			
			System.out.println(text.codePointAt(1));
			
			//compareTo (Compara dos cadenas)
			
			System.out.println(text.compareTo(text1));
			
			//compareToIgnoreCase (Igual que la anterior, pero ignorando la diferencia
			//entre mayúsculas y minusculas.
			
			System.out.println(text.compareToIgnoreCase(text1));
			
			//concat (Concatena)
			
			System.out.println(text.concat(text1));
			
			//endsWith (Comprueba si la cadena termina con un sufijo especificado)
			
			System.out.println(text1.endsWith("!"));
			
			//equalsIgnoreCase (Igual que equals, pero ignorando la diferencia entre mayúsculas
			//y minúsculas.
			
			System.out.println(text.equalsIgnoreCase(text2));
			
			//indexOf (Devuelve el índice donde se encuentra la primera coincidencia del caracter
			//elegido.
			
			System.out.println(text1.indexOf('n'));
			
				//Se le puede indicar desde que indice queremos que empiece a buscar.
			
			System.out.println(text1.indexOf('n', 7));
			
			//isEmpty (Devuelve true si la cadena es vacía)
			
			System.out.println(text3.isEmpty());
			
			System.out.println(text2.isEmpty());
			
			//lastindexOf (Devuelve el índice donde se encuentra la última coincidencia del caracter
			//elegido.
			
			System.out.println(text1.lastIndexOf('n'));
			
			// Tambien podemos indicarle desde que indice podemos decirle que empiece a buscar.
			
			System.out.println(text1.lastIndexOf('a', 3));
			
			//replace (Sustituye todos los caracteres de una cadena por un caracter especificado
			
			System.out.println(text.replace('a', '4'));
			
			//toUpperCase (Devuelve la cadena en mayúsculas
			
			System.out.println(text2.toUpperCase());
			
			//trim (Devuelve la cadena sin espacios)
			
			System.out.println(text1.trim());
			
			
		
		
		
		

	}

}
