//Que39: Implement a Java program that reads via CLA (size type) example: 1 KB / 1 MB, calculate the memory in bytes.

class Memory{
	public static void main(String[] args){
		int n=Integer.parseInt(args[0]);
		
		if(n<0){
			System.out.println("No memory");
			System.exit(0);
		}
		
		switch(args[1]){
			case "kb":
			case "KB": System.out.println("Memory in Bytes : "+(n * Math.pow(2,10)));
						break;
						
			case "mb":
			case "MB": System.out.println("Memory in Bytes : "+(n * Math.pow(2,20)));
						break;			
					
			case "gb":
			case "GB": System.out.println("Memory in Bytes : "+(n * Math.pow(2,30)));
						break;			
						
			case "tb":
			case "TB": System.out.println("Memory in Bytes : "+(n * Math.pow(2,40)));
						break;
			
			default: System.out.println("No input");
					 break;
		}
	}
}