import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		
		int cislo = 0;
	    int kolik = 0;
			
			try {
			System.out.println("Vyber jednu z typu zkouseni =>");
			System.out.println("1.) scitani, odcitani, nasobeni a deleni celych cisel");
			System.out.println("2.) scitani, odcitani, nasobeni a deleni zlomku");
			System.out.println("3.) prevody mezi ciselnymi soustavami (desitkova, dvojkova, sestnactkova)");
			System.out.print("Tva volba: ");
			cislo = scanner.nextInt();
			System.out.print("Kolik budete chtit prikladu (1-4): ");
			kolik = scanner.nextInt();
			if(kolik > 4 || kolik < 1) {
				System.out.println("Prosim drzte se nabidnuteho rozhrani.");
			}
			}catch(InputMismatchException e){
				System.out.println("Nezadali jste cislo !");
			}
	    
			
			int rnd = random.nextInt(2)+1;
			System.out.println(rnd);
			
			if(rnd == 1 && cislo == 1 && kolik == 1) {
				int number1 = random.nextInt(20)-10;
				int number2 = random.nextInt(20)-10;
				if(number2 < 0) {
					System.out.print(number1+" + ("+number2+") = ");
				}else {
				System.out.print(number1+" + "+number2+ " = " );
				}
				int vysl = scanner.nextInt();
				int vysledek = number1+number2;
				if(vysledek == vysl) {
					System.out.println("Spravne :D");
				}else {
					System.out.println("Spatne :(");
				}
			}
			
			if(rnd == 1 && cislo == 1 && kolik == 2) {
				for(int i = 0; i< 2; i++) {
				int number1 = random.nextInt(20)-10;
				int number2 = random.nextInt(20)-10;
				if(number2 < 0) {
					System.out.print(number1+" + ("+number2+") = ");
				}else {
				System.out.print(number1+" + "+number2+ " = " );
				}
				int vysl = scanner.nextInt();
				int vysledek = number1+number2;
				if(vysledek == vysl) {
					System.out.println("Spravne :D");
				}else {
					System.out.println("Spatne :(");
				}
				}
			}
	
			if(rnd == 1 && cislo == 1 && kolik == 3) {
				for(int i = 0; i< 3; i++) {
				int number1 = random.nextInt(20)-10;
				int number2 = random.nextInt(20)-10;
				if(number2 < 0) {
					System.out.print(number1+" + ("+number2+") = ");
				}else {
				System.out.print(number1+" + "+number2+ " = " );
				}
				int vysl = scanner.nextInt();
				int vysledek = number1+number2;
				if(vysledek == vysl) {
					System.out.println("Spravne :D");
				}else {
					System.out.println("Spatne :(");
				}
				}
			}
		
			if(rnd == 1 && cislo == 1 && kolik == 4) {
				for(int i = 0; i< 4; i++) {
				int number1 = random.nextInt(20)-10;
				int number2 = random.nextInt(20)-10;
				if(number2 < 0) {
					System.out.print(number1+" + ("+number2+") = ");
				}else {
				System.out.print(number1+" + "+number2+ " = " );
				}
				int vysl = scanner.nextInt();
				int vysledek = number1+number2;
				if(vysledek == vysl) {
					System.out.println("Spravne :D");
				}else {
					System.out.println("Spatne :(");
				}
				}
			}
		
			if(rnd == 2 && cislo == 1 && kolik == 1) {
				
				int number1 = random.nextInt(20)-10;
				int number2 = random.nextInt(20)-10;
				if(number2 < 0) {
					System.out.print(number1+" - ("+number2+") = ");
				}else {
				System.out.print(number1+" - "+number2+ " = " );
				}
				int vysl = scanner.nextInt();
				int vysledek = number1+number2;
				if(vysledek == vysl) {
					System.out.println("Spravne :D");
				}else {
					System.out.println("Spatne :(");
				}
				
			}
		
            if(rnd == 2 && cislo == 1 && kolik == 2) {
				for(int i = 0; i< 2; i++) {
				int number1 = random.nextInt(20)-10;
				int number2 = random.nextInt(20)-10;
				if(number2 < 0) {
					System.out.print(number1+" - ("+number2+") = ");
				}else {
				System.out.print(number1+" - "+number2+ " = " );
				}
				int vysl = scanner.nextInt();
				int vysledek = number1+number2;
				if(vysledek == vysl) {
					System.out.println("Spravne :D");
				}else {
					System.out.println("Spatne :(");
				}
				}
			}
		
            if(rnd == 2 && cislo == 1 && kolik == 3) {
            	for(int i = 0; i< 3; i++) {
				int number1 = random.nextInt(20)-10;
				int number2 = random.nextInt(20)-10;
				if(number2 < 0) {
					System.out.print(number1+" - ("+number2+") = ");
				}else {
				System.out.print(number1+" - "+number2+ " = " );
				}
				int vysl = scanner.nextInt();
				int vysledek = number1+number2;
				if(vysledek == vysl) {
					System.out.println("Spravne :D");
				}else {
					System.out.println("Spatne :(");
				}
            	}
			}
		
            if(rnd == 2 && cislo == 1 && kolik == 4) {
            	for(int i = 0; i< 4; i++) {
				int number1 = random.nextInt(20)-10;
				int number2 = random.nextInt(20)-10;
				if(number2 < 0) {
					System.out.print(number1+" - ("+number2+") = ");
				}else {
				System.out.print(number1+" - "+number2+ " = " );
				}
				int vysl = scanner.nextInt();
				int vysledek = number1+number2;
				if(vysledek == vysl) {
					System.out.println("Spravne :D");
				}else {
					System.out.println("Spatne :(");
				}
            	}
			}
		
		
		
		
		
		
		
		
		

	}

}
