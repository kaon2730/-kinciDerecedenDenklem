package ÝkinciDerecedenDenklem;
import java.util.Scanner;

public class KökBulma {

	public static void main(String[] args) {
		
		Scanner KullanýcýDeger = new Scanner(System.in);
		System.out.println("Derecesi 2 olan terimin katsayýsýný giriniz");
		double a = KullanýcýDeger.nextDouble();
		System.out.println("Derecesi 1 olan terimin katsayýsýný giriniz");
		double b = KullanýcýDeger.nextDouble();
		System.out.println("Derecesi 0 olan terimin katsayýsýný giriniz");
		double c = KullanýcýDeger.nextDouble();
		
		double delta = b*b-4*(a*c);
		
		if (a == 0.0 ) {
			System.out.println("Ýkinci dereceden denklemin baþkatsayýsý 0'a eþit olamaz.");
		}
		else {
			if (delta < 0) {
			System.out.println("Denklemin reel kökü yoktur");
		}
		if (delta == 0) {
			System.out.println("Denklemin çift katlý tek kökü vardýr :" + (-b/2*a) );
		}
		if (delta > 0) {
			System.out.println("Denklemin iki farklý reel kökü vardýr:" + ((-b + Math.sqrt(delta) ) / 2*a) + 
					" ve " + ((-b - Math.sqrt(delta) ) / 2*a));
		}
		}

	}

}
