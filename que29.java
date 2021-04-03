//Que29: Implement a Java program to check a number is a cube or not

class Perfect_cube{
	public static void main(String[] args){
		int num=216;
		int ori=num;
		int n=(int)Math.round(Math.pow(num,1.0/3.0));
		
		if(num==n*n*n)
			System.out.println("Given Number is a perfect cube : "+ori);
		
		else
			System.out.println("Given Number is Not a perfect cube : "+ori);
	}
}
