package �kinciDerecedenDenklem;
import java.util.Scanner;

public class K�kBulma {

	public static void main(String[] args) {
		
		Scanner Kullan�c�Deger = new Scanner(System.in);
		System.out.println("Derecesi 2 olan terimin katsay�s�n� giriniz");
		double a = Kullan�c�Deger.nextDouble();
		System.out.println("Derecesi 1 olan terimin katsay�s�n� giriniz");
		double b = Kullan�c�Deger.nextDouble();
		System.out.println("Derecesi 0 olan terimin katsay�s�n� giriniz");
		double c = Kullan�c�Deger.nextDouble();
		
		double delta = b*b-4*(a*c);
		
		if (a == 0.0 ) {
			System.out.println("�kinci dereceden denklemin ba�katsay�s� 0'a e�it olamaz.");
		}
		else {
			if (delta < 0) {
			System.out.println("Denklemin reel k�k� yoktur");
		}
		if (delta == 0) {
			System.out.println("Denklemin �ift katl� tek k�k� vard�r :" + (-b/2*a) );
		}
		if (delta > 0) {
			System.out.println("Denklemin iki farkl� reel k�k� vard�r:" + ((-b + Math.sqrt(delta) ) / 2*a) + 
					" ve " + ((-b - Math.sqrt(delta) ) / 2*a));
		}
		}

	}

}
