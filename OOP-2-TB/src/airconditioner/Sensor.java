package airconditioner;

public class Sensor {
	Fan rpm = new Fan();
	static boolean power ;
	static String mode ;
	static int celcius(int cel,int fahr) {
		return (cel = fahr) ;
	}
	
	
	public static void main(String[] args) {
		
	Fan.main(args);
		for(int bil = 0; bil <= 100 ;bil += 1) {
			System.out.println(bil);
		}
	
	System.out.println((power)? "off" : "on");
	
	}
}
