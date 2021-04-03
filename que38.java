//Que38: Implement a Java program that reads a number in inches, converts it to meters(CLA)

class Inch_meter{
	public static void main(String[] args){
		double inch=1000;
		//double inch=Double.parseDouble(args[0]);
		double meter=0.0254*inch;
		
		System.out.println(inch+" : For the given value of inch the meter convertion is: "+meter+"m");
	}
}
