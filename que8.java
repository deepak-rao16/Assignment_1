//Que8: Implement a JAVA program to find the odd numbers between 0-100

class Odd_num{
	public static void main(String[] args){
		
		int i;
		
		System.out.println("The odd numbers from 0 to 100 are:\n ");
		
		for(i=0;i<=100;i++)
		{
			if(i%2!=0)
				System.out.println(i);
		}
	}
}	