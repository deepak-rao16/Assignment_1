//Que41: Implement a Java program to takes the user for a distance (in meters) and the time was taken (as three numbers: hours, minutes, seconds), and display the speed, in meters per second, kilometres per hour and miles per hour (hint: 1 mile = 1609 meters).

class Distance_time{
	public static void main(String[] args){
		int dis=500;
		int sec=30;
		int min=30;
		int hour=1;
		
		double time_taken=(double)(sec+(min*60)+(hour*60*60));
		double mps=dis/time_taken;
		double kmph=3.6*mps;
		double mph= 2.23694*mps;
		
		System.out.println("speed of the user is: "+mps+"mps, and :"+kmph+"kmph and : "+mph+"mph ");
	}
}