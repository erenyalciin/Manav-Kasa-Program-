import java.util.Scanner;
public class manavKasa {

	public static void main(String[] args) {
		
		
		
/*
Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL		
 */
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("");

		
		System.out.print("Armut Kaç Kilo? ");
		double armut = sc.nextDouble();
		

		
		System.out.print("Elma Kaç Kilo? ");
		double elma = sc.nextDouble();
		
		
		System.out.print("Domates Kaç Kilo? ");
		double domates = sc.nextDouble();
		
		
		System.out.print("Muz Kaç Kilo? ");
		double muz = sc.nextDouble();
		
		
		System.out.print("Patlıcan Kaç Kilo? ");
		double patlıcan = sc.nextDouble();
		
		double armutT = armut * 2.14;
		double elmaT = elma * 3.67;
		double domatesT = domates * 1.11;
		double muzT = muz * 0.95;
		double patlıcanT = patlıcan * 5.00;
		
		double toplam = (armutT + elmaT+ domatesT+ muzT+ patlıcanT);
		
		System.out.println("Toplam Tutar: " + toplam);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
