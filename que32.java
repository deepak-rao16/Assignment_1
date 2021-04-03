//Que32: Implement java program to find any number between 1 and n that can be expressed as the sum of two cubes in two (or more) different ways 

class Cubes_n{
	public static void main(String[] args){
		
		int n = 100000;
		int a,a3,b,b3,c,c3,d,d3;
        // for each a, b, c, d, check whether a^3 + b^3 = c^3 + d^3
        for ( a = 1; a <= n; a++) {
            a3 = a*a*a;
            if (a3 > n) 
				break;

            for (b = a; b <= n; b++) {
                b3 = b*b*b;
                if (a3 + b3 > n) 
					break;

                 for (c = a + 1; c <= n; c++) {
					c3 = c*c*c;
                    if (c3 > a3 + b3)
						break;

                    for ( d= c; d <= n; d++) {
                        d3 = d*d*d;
                        if (c3 + d3 > a3 + b3)
							break;

                        if (c3 + d3 == a3 + b3) {
                            System.out.print((a3+b3) + " = ");
                            System.out.print(a + "^3 + " + b + "^3 = "); 
                            System.out.print(c + "^3 + " + d + "^3"); 
                            System.out.println();
                        }
                    }
                }
            }
        }
    }
}
