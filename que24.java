//Que24: Implement a Java program to check whether a number is a Pronic Number or Heteromecic Number3

class Pronic{
	public static void main(String[] args){
		int n=110;
		int flag=0;
		int i;
		
		for(i=0;i<n;i++){
			if(i*(i+1)==n){
				flag=1;
				break;
			}
		}
		
		if(flag==1)
			System.out.println("Given number:"+n+", is a Pronic number");
		
		else
			System.out.println("Given number:"+n+", is a Not a Pronic number");
	}
}
		