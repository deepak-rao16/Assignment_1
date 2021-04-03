//Que40: Implement a Java program to compute body mass index (BMI).

class Body_mass_index{
	public static void main(String[] args){
		double height=1.86;
		double weight=94.3;
		
		double BMI=weight/(height*height);
		
		System.out.println("Body Mass Index for given height: "+height+"m, and given weight : "+weight+"kg, is : "+BMI+"kg/m^2");
	}
}
		