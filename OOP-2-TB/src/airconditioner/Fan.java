package airconditioner;
import voltage.Daya;
public class Fan {
	// case 1 tentang kecepatan fan kipas
	static int RPM = 2400;
	static Boolean AutoFan;
	static String mSg;
	
	static void FanMachine() {
		if (RPM < 900) {
			System.out.println("Fan is Slow ");
		}else if (RPM < 1400) {
			System.out.println("Fan is MidSpeed");
		}else if (RPM <= 2400) {
			System.out.println("Fan is Fast");
		}else {
			System.out.println(mSg);
			if (mSg == "Your Fan is Auto") {
				System.out.println(mSg);
			}else {
				System.out.println("Your Fan Is Manual");
			}
		}
	}

	
	
	
public static void main(String[] args) {
	Daya.main(args);
	FanMachine();
	
	
	}
}
