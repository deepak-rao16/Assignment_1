//Que31: Implement a Java program to display first 10 Fermat numbers.

class Fermat{
	public static void main(String[] args){
		int n=0;
		double res;
		
		System.out.println("The Fermat numbers are: ");
		
		while(n<=10){
			res=Math.pow(2,Math.pow(2,n))+1;
			n++;
			System.out.println(res);
		}
	}
}