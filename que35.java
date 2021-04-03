//Que35: Implement a Java program to print the first 15 numbers of the Pell series.

class Pell_series{
	public static void main(String[] args){
		int i,n1=1,n2=0,n3;
		System.out.println("Pell Series of first 15 numbers are: ");
			for(i=1; i<=15; i++){
				n3= n1 + 2*n2;
				System.out.println(n3+" ");
				n1 = n2;
				n2 = n3;
			}
	}
}