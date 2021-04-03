//Que6: Implement a JAVA program to find the square using newton raphson method.
class Sq_newton_raphson{
	static double square_root(double n, double l)
	{
		double x=n;
		double sq;
		
		while(true)
		{
			sq=0.5 * (x+(n/x));
			
			if(Math.abs(sq-x)<1)
				break;
			
			x=sq;
		}
		return sq;	
	}

	public static void main(String[] args){
		double n=16;
		double l=0.00001; //tolerance level
		
		System.out.println(square_root(n,l));
	}
}
	