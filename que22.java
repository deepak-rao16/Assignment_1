//Que22: Check whether the number is a palindrome number or not

class Plaindrome{
	public static void main(String[] args){
		int n=121; 
		int rev=0, rem, original;
		original=n;
		
		while(n!=0){
			rem=n%10;
			rev=rev*10+rem;
			n/=10;
		}
		
		if(original==rev)
			System.out.println("The given number: "+original+" is a palindrome");
		
		else
			System.out.println("The given number:"+original+" is not a palindrome");
	}
}