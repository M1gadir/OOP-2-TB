package voltage;

public class Daya {
	static String tegaNgan = "on";
	public static int volTage = 220 ;
	public static int waTt = 120 ;
	static String outPut;
	
	
	public static void main(String[] args) {
		switch (tegaNgan) {
		case "off" :
			System.out.println((volTage < 220) && (waTt < 120));
			System.out.println("maaf mungkin StopKontak Belum terhubung");
			break;
		case "on" :
			System.out.println((volTage == 220) && (waTt == 120));
			System.out.println("Listrik sudah tetrsambung mesin akan dinyalakan");
			break;
		}
	}
}
