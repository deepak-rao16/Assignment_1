//Que3: Implement a JAVA program to print the ASCII values of A-Z, a-z , 0-9
class ASCII_values{
	public static void main(String[] args){
		int i;
		
		for(i=65;i<=90;i++)//  form A to Z
		{
			System.out.println("ASCII values of: "+(char)i+" is :"+i);
		}
		
		for(i=97;i<=122;i++)  // form a to z
		{
			System.out.println("ASCII values of: "+(char)i+" is: "+i);
		}
		
		for(i=48;i<=57;i++) // from 0 to 9
		{
			System.out.println("ASCII values of: "+(char)i+" is: "+i);
		}
	}
}	