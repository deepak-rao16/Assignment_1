//Que16: Find the determinant, for the quadratic equations.
class Determinant_quadratic{
	
	public static void main(String[] args){
		
		double first_root=0;   // initialization
		double second_root=0;
		double a=5,b=8,c=3;
		double determinant, sqrt;
		
		System.out.println("The value of equation: "+a+"x^2 + "+b+"y + "+c+" =0" );
		System.out.println("The value of a: "+a+", b: "+b+" and c: "+c);
		
		determinant=(b*b)-(4*a*c);
		sqrt=Math.sqrt(determinant);
		
		if(determinant > 0){
			first_root=(-b+sqrt)/(2*a);
			second_root=(-b-sqrt)/(2*a);
			
			System.out.println("Root of the equations are: "+first_root+" and: "+second_root);
		}
			
		else if(determinant==0)
			System.out.println("Root of the equations are: "+((-b+sqrt)/(2*a)));
	}
}
			