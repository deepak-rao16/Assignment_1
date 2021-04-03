//Que48: Implement a java program to find the memory size in bytes given the input as address length. 

class Memory_size{
	public static void main(String[] args){
		int start=23338;
		int end=23448;
		int bytes=(end-start)/8;
		System.out.println("Memory size in byte: "+bytes);
	}
}
