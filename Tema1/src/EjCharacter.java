
public class EjCharacter {

	public static void main(String[] args) {
		
		//Character
		
		Character character = new Character('s');
		
		Character character2 = new Character('n');
		
			//charValue (Muestra el caracter)
				
			System.out.println(character.charValue());
			
			//compare (char, char)
			
			System.out.println(Character.compare('A', 'a'));
			
			// equals (boolean)
			
			System.out.println(character.equals('s'));
			
			System.out.println(character.equals(character2));
			
			// isDigit (boolean)
			
				System.out.println(Character.isDigit('1'));
				
				System.out.println(Character.isDigit(character));
				
			// isLetter (boolean)
				
				System.out.println(Character.isLetter('1'));
				
				System.out.println(Character.isLetter(character));
				
			//isSpaceChar (boolean)
				
				System.out.println(Character.isSpaceChar(' '));
				
				System.out.println(Character.isSpaceChar(character2));
				
			//isUpperCase (boolean)
				
				System.out.println(Character.isUpperCase('S'));
				
				System.out.println(Character.isUpperCase('s'));
				
			//isLowerCase (boolean)
				
				System.out.println(Character.isLowerCase('S'));
				
				System.out.println(Character.isLowerCase('s'));
				
			//valueOf
				
				System.out.println(Character.valueOf(character));
				
				System.out.println(Character.valueOf(character2));
				
				System.out.println(Character.valueOf('p'));

	}

}
