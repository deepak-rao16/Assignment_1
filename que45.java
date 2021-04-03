//Que45: Implement a java program to check whether there is any occurrence of characters in a n-digit input number.

class Char_check{
	public static void main(String[] args){
		int i, flag=0;
		char ch;
		
		String str=args[0];
		
		for(i=0;i<str.length();i++){
			ch=args[0].charAt(i);
			if((ch<'0')||(ch>'9')){
				flag=1;
				break;
			}
		}
		
		if(flag==1)
			System.out.println("Characters are present");
		
		else
			System.out.println("No characters are present");
	}
}