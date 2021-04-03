//Que21: Implement Java program to check if a given number is Fibonacci number or not

class Fibonacci{
	static boolean perfect_square(int i){
		int sq=(int) Math.sqrt(i);
		return (sq*sq==i);
	}

	static boolean fibonacci(int i){
		return perfect_square(5*i*i+4)|| perfect_square(5*i*i-4);
	}
	
	public static void main(String[] args){
		int n=5;
		System.out.println(fibonacci(n) ? n+": given number is Fibonacci number " : n+": given number is Not a Fibonacci number ");
	}
}
		