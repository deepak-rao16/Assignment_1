//Que11: Implement a JAVA program to implement a Full adder using Bitwise operator

class Full_adder{
	
	int ex_or_gate(int i, int j){
		int x=i;
		int y=j;
		int ans;
		int exor_ans;
		
		exor_ans=(x & (~y)) | ((~x )& y);
		return exor_ans;
	}

	int and_gate(int i, int j){
		int x=i;
		int y=j;
		int ans;
		int and_ans;
		
		and_ans= x & y;
		return and_ans;
	}
	
	int or_gate(int in1, int in2){
		
		int a,b;
		a=in1;
		b=in2;
		int ans;
		int or_ans;
		// using the | operator
		or_ans= a|b;
		return or_ans;
	}
	
	public static void main(String[] args){
		
		int inp1=1;  //input
		int inp2=1;
		int inpc=1;
		
		Full_adder full=new Full_adder();
		
		int exp1=full.ex_or_gate(inp1,inp2);
		int exp2=full.ex_or_gate(inpc, exp1);
		
		int sum= exp2; // for SUM of full adder
		
		int exp3=full.and_gate(inp1,inp2);
		int exp4=full.and_gate(inpc, exp2);
		int exp5=full.or_gate(exp3,exp4);
		int carry=exp5;
		
		System.out.println("For the input: "+inp1+", "+inp2+", "+inpc+"\nThe sum: "+sum+"\nThe carry: "+carry);
	}
}	
		
		