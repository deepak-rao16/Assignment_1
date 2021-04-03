//Que17: Find the distance between two points, using euclidean distance.

class Euclidean{
	
	public static void main(String[] args){
		int x1,x2,y1,y2;
		double distance;
		//initialize points in x-y plane
		x1=1;
		y1=2;
		x2=3;
		y2=4;
		
		distance=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		
		System.out.println("Distance between: "+"("+x1+","+y1+"), "+"("+x2+","+y2+") is: "+distance);
	}
}