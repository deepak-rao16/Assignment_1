//Que18: Find the power of the number without using existing methods.

class Power_number{
	
	public static void main(String[] args){
		double base=3,exp=4;
		double res=1;
		double e=exp;
		while(exp!=0){
			res *=base;
			--exp;
		}
			
		System.out.println("Power of "+base+"^"+e+" is: "+res);
	}
}	