//Que50: Implement a java program to find the LCD of the given numbers

class LCD{
	static int gcd(int a, int b){
		if(a==0)
			return b;
	
		return gcd(b%a, a);
	}
	
	static int lcm(int a, int b){
		return (a*b)/gcd(a,b);
	}
	
	static void res_sum(int n1,int d1, int n2, int d2 ){
		int lcd=lcm(d1,d2);
		n1*=(lcd/d1);
		n2*=(lcd/d2);
		
		int res_num=n1+n2;
		
		System.out.println(res_num+"/"+lcd);
	}
	
	public static void main(String[] args){
		int n1=1,d1=6;
		int	n2=7, d2=15;
		res_sum(n1,d1,n2,d2);
	}
}