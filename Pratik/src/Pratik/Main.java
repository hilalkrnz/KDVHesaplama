package Pratik;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	double tutar ;
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Girilecek tutar : ");
	tutar = scanner.nextDouble();
	
	if(tutar <= 1000) {
		
		double kdvliTutar = (tutar * (0.18)) + tutar;
		double kdvTutari = (tutar * (0.18));
		
		System.out.println("KDV'siz fiyat : " + tutar);
		System.out.println("KDV'li fiyat : " + kdvliTutar);
		System.out.println("KDV tutarý : " + kdvTutari); 
	}else {
		
		double kdvliTutar = (tutar * (0.08)) + tutar;
		double kdvTutari = (tutar * (0.08));
		
		System.out.println("KDV'siz fiyat : " + tutar);
		System.out.println("KDV'li fiyat : " + kdvliTutar);
		System.out.println("KDV tutarý : " + kdvTutari);
	}
		
	
	}

}
