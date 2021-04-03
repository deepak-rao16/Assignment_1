//Que37: Implement a Java program to create the first twenty Hamming numbers

class Hamming_number{
	public static void main(String[] args){
		int n=2,num, count=0;
		
		System.out.println("Hamming numbers are: ");
		System.out.println(1);
		
		while(count<20){
			num=n;
			while(n%2==0)
				n/=2;
			
			while(n%3==0)
				n/=3;
			
			while(n%5==0)
				n/=5;
			
			if(n==1){
				System.out.println(num);
				count++;
			}
				
			n=num;
			n++;
		}
	}
}