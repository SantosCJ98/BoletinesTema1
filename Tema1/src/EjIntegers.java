
public class EjIntegers {

	public static void main(String[] args) {
		
		Integer integer = new Integer(4);
		
		Integer integer2 = new Integer(5);
		
			//byteValue
		
			System.out.println(integer.byteValue());
			
			//compare
			
			System.out.println(Integer.compare(5, 4));
			
			//compareTo
			
			System.out.println(Integer.compare(integer2, integer));
			
			//compareUnsigned
			
			System.out.println(Integer.compareUnsigned(4, 2));
			
			//divideUnsigned
			
			System.out.println(Integer.divideUnsigned(4, 2));
			
			//doubleValue
			
			System.out.println(integer.doubleValue());
			
			//equals
			
			System.out.println(integer.equals(integer2));
			
			//intValue
			
			System.out.println(integer2.intValue());
			
			//max
			
			System.out.println(Integer.max(integer, integer2));
			
			//min
			
			System.out.println(Integer.min(integer, integer2));
			
			// parseInt
			
			System.out.println(Integer.parseInt("13"));
			
			// sum
			
			System.out.println(Integer.sum(4, integer));
			
			// valueOf
			
			System.out.println(Integer.valueOf(4));
			
			// valueOf (String)
			
			System.out.println(Integer.valueOf(4));
			
			

	}

}
