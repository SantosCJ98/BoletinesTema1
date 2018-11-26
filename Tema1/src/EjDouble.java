
public class EjDouble {

	public static void main(String[] args) {
		Double d1 = new Double(1.5);
		Double d2 = new Double(3.75);
		
		//compare
		
		System.out.println(Double.compare(2.3, 2.2));
		
		System.out.println(Double.compare(d1, d2));
		
		//doubleValue
		
		System.out.println(d1.doubleValue());
		
		//equals
		
		System.out.println(d1.equals(1.2));
		
		System.out.println(d1.equals(1.5));
		
		//floatValue
		
		System.out.println(d2.floatValue());
		
		//intValue
		
		System.out.println(d1.intValue());
		
		//isInfinite
		
		System.out.println(d1.isInfinite(1.2));
		
		System.out.println(Double.isInfinite(9.2));
		
		//isNaN
		
		System.out.println(d1.isNaN(1.2));
		
		System.out.println(Double.isNaN(9.2));
		
		//max
		
		System.out.println(Double.max(d1, 0.2));
		
		//min
		
		System.out.println(Double.min(d1, 0.2));
		
		// parseDouble
		
		System.out.println(Double.parseDouble("3.63"));
		
		// sum
		
		System.out.println(Double.sum(2.5, d2));
		
		// valueOf
		
		System.out.println(Double.valueOf(5.2));
					
		// valueOf (String)
					
		System.out.println(Double.valueOf("5.2"));
		
	}

}
