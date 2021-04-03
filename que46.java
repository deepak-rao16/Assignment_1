//Que46: Implement a java program to find the area of a) Circle b) Rectangle c) Square d) trapezoid e) rhombus f) triangle.

class Area_{
	double circle(double r){
		return r*r*(Math.PI);
	}
	
	double triangle(double h, double b){
		return 0.5*h*b;
	}
	
	double rectange(double l, double b){
		return l*b;
	}
	
	double square(double s){
		return s*s;
	}
	
	double rhombus(double b, double h){
		return b*h;
	}
	
	double trapezoid(double b1, double b2, double h){
		return ((b1+b2)/2)*h;
	}
	
	public static void main(String[] args){
		Area_ a= new Area_();
		System.out.println("Area of the circle: "+a.circle(3));
		System.out.println("Area of the triangle: "+a.triangle(5,6));
		System.out.println("Area of the rectange: "+a.rectange(5,6));
		System.out.println("Area of the square: "+a.square(6));
		System.out.println("Area of the rhombus: "+a.rhombus(5,8));
		System.out.println("Area of the trapezoid: "+a.trapezoid(5,3,2));
	}
}

		
		
		