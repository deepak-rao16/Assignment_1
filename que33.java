//Que33: Implement a program to check if a number is Mersenne number or not.

class Mersenne_num{
	public static void main(String[] args){
		int n=127;
		int n1=n+1;
		
		int pow=0, ans=0,i;
		for(i=0;;i++){
			pow=(int)Math.pow(2,i);
			
			if(pow>n1)
				break;
			
			else if(pow==n1){
				System.out.println(n+" : Given number is a Mirsenne number ");
				ans=1;
			}
		}
		if(ans==0)
			System.out.println(n+" : Given number is Not a Mirsenne number ");
	}
}