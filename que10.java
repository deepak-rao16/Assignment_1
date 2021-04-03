//Que10: Implement a JAVA program to implement a Half adder using Bitwise operator
class Half_adder{
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

	public static void main(String[] args){
		int inp1=1; // any binary input
		int inp2=1; // any binary input
		
		Half_adder half= new Half_adder();
		
		int exor_res= half.ex_or_gate(inp1,inp2);
		int and_res= half.and_gate(inp1,inp2);
		
		//int result= 
		System.out.println("The Sum is: "+exor_res);
		System.out.println("The carry is: "+and_res);
	}
}	