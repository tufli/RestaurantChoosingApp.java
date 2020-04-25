package Main;

public class Main {
public static void main(String[] args){

 	VeganRestaurant.Info.printMenu();
 	SushiRestaurant.Info.printMenu();
	}
}
class VeganRestaurant {
	 	 	static class Info {
	   	   		static void printName() {
  	 	System.out.println("########### Sushi Mini Restaurant ###########");
	   		}
	   	   		static void printAddress() {
  	 	System.out.println("-- DownTown Str 88/A, Minicity             --");
	 		}
	 		
	   	   		static void printMenu() {
	 			printName();
	 			printAddress();
	 			System.out.println("MENU x 1 portiont"+"         "+Menu.getPrice(1)+"MDL");
	 			System.out.println("MENU x 5 portiont(-10%)"+"   "+Menu.getPrice(5)+"MDL");
	 			System.out.println("MENU x 1 portiont"+"         "+SpecialMenu.getPrice(1)+"MDL");
	 			System.out.println("MENU x 10 portiont(-20%)"+"   "+SpecialMenu.getPrice(10)+"MDL");
	 		}
	 	 }
	 	
	 	static class Menu {
    	   	static double getPrice(int portions) {
    	   		double price =100;
    	   		if(portions==5) {
    	   			price=price/100*90;
    	   		}else {price=100;
    	   		}
    	   	   	double result = price * portions;
    	   	return result; 
    	   	 }	   
	 	 }
			static class SpecialMenu {
	 		static double getPrice(int portions) {
	 			double price =300;
    	   		if(portions==10) {
    	   			price=price/100*80;
    	   		}else {price=300;
    	   		}
    	   	   	double result = price * portions;
    	   	return result; 
	 		 }
	 	 }
		}
class SushiRestaurant {
   
	static class Info {
		static void printName() {
	  	 	System.out.println("########### Vegan Pure Restaurant ###########");
		   		}
		static void printAdress() {
			System.out.println("-- UpTown Str 77/B, Maxicity               --");
		}
		static void printMenu() {
			printName();
 			printAdress();
 			System.out.println("MENU x 1 portiont"+"         "+Menu.getPrice(1)+"MDL");
 			System.out.println("MENU x 5 portiont(-5%)"+"   "+Menu.getPrice(5)+"MDL");
 			System.out.println("MENU x 1 portiont"+"         "+SpecialMenu.getPrice(1)+"MDL");
 			System.out.println("MENU x 10 portiont(-10%)"+"   "+SpecialMenu.getPrice(10)+"MDL");
			
		}
    }
	static class Menu {
	   	static double getPrice(int portions) {
	   		double price =50;
	   		if(portions==5) {
	   		price=price/100*95;
	   		}else {price=50;
	   		}
	   	   	double result = price * portions;
	   	return result; 
	   	 }	   
 	 }

	static class SpecialMenu {
 		static double getPrice(int portions) {
 			double price =200;
	   		if(portions==10) {
	   			price=price/100*90;
	   		}else {price=200;
	   		}
	   	   	double result = price * portions;
	   	return result; 
 		 }
 	 }
  }
	
	 
	
	 	


	 	






