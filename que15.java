//que15: Implement a JAVA program to multiply two numbers using recursive multiplication
class Recursive_multi{
	static int multi(int a, int b)
    {
        if (a < b)
            return multi(b, a);
     
        else if (b != 0)
            return (a + multi(a, b - 1));
      
        else
            return 0;
    }
	
	public static void main(String[] args){
		int a=2, b=4;
	//	int val=mul(a,b);
		
		System.out.println("The multiplication of: "+a+" and :"+b+" is: "+multi(a,b));
	}
}