//Que51: Find the hexadecimal equivalent for a given 4-digit binary number.

class Binary_to_hexa{
	public static void main(String[] args){
		int[] hex=new int[1000];
		
		int i=1,j=0,rem,dec=0,bin;
		
		bin=1101;
		int bin_orig=bin;
		
		while(bin>0){
			rem=bin%2;
			dec=dec+rem*i;
			i=i*2;
			bin=bin/10;
		}
		
		i=0;
		
		while(dec!=0){
			hex[i]=dec%16;
			dec=dec/16;
			i++;
		}
		
		System.out.print("For the given binary value: "+bin_orig+", Hexa decimal value:  ");
		for(j=i-1;j>=0;j--){
			if(hex[j]>9){
				System.out.println(hex[j]);
			}
		}
	}
}
