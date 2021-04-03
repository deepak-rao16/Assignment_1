//Que47: Implement a java program to find whether a circle is inside another circle or not. (consider all the possible cases)

class Circle_inside_a_circle{
	static void circle(int x1,int y1, int x2, int y2, int r1, int r2){
		int dis=(int)Math.sqrt(((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2)));
		
		if(dis+r2==r1)
			System.out.println("Smaller Circle is inside the large circle just touching each other ");
			
			
		else if(dis+r2<r1)
				System.out.println("Smaller circle lies completely inside the bigger circle without touching each other");
			
		else
			System.out.println("Smaller circle does not lie inside the bigger circle");
	}
	
	public static void main(String[] args){
		int x1=10,y1=8;
		int x2=1, y2=2;
		int r1=30,r2=10;
		circle(x1,y1,x2,y2,r1,r2);
	}
}