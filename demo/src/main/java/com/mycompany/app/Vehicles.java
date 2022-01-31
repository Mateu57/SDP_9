package com.mycompany.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Vehicles {

	final static Logger logger = LoggerFactory.getLogger(Vehicles.class);

	private static String wybor;

	
	public static void main(String[] args) {
		Car BMW = new Car("BMW", 260);
		Car AUDI = new Car("AUDI", 280);
		
		Ship SpeedoShip = new Ship("SpeedoShip", 100);
		Ship StandardSHIP = new Ship("StandardSHIP", 80);

		Plane Latacz = new Plane("Latacz", 800);
		Plane Spadacz = new Plane("Spadacz", 700);
		
		Bicycle Romet = new Bicycle("Romet", 50);
		Bicycle BiSpeed = new Bicycle("BiSpeed", 40);
		
		
		ArrayList<String> vehicles = new ArrayList<>();
	    vehicles.add("\nCAR: "+BMW.Producent + " " + AUDI.Producent);
	    vehicles.add("SHIP: "+SpeedoShip.Producent+" "+StandardSHIP.Producent);
	    vehicles.add("PLANE: "+Latacz.Producent+" "+Spadacz.Producent);
	    vehicles.add("BICYCLE: "+Romet.Producent+" "+BiSpeed.Producent);
	    vehicles.add("ALL");
	    vehicles.add("EXIT");

	    for (int i = 0; i < vehicles.size(); i++) {
	    	System.out.println(vehicles.get(i));
	    }


	do {
		logger.info("\nWybierz opcję lub kategorię (np. CAR):");
	    @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);	
	    String wybor = scan.nextLine();
		
	
		switch (wybor) {
	    case "CAR":
	    	wyswietl(wybor, AUDI.Producent, AUDI.vmax);
	    break;
	    case "SHIP":
	    	wyswietl(wybor, SpeedoShip.Producent, SpeedoShip.vmax);
	    break;
	    case "PLANE":
	    	wyswietl(wybor, Latacz.Producent, Latacz.vmax);
	    break;
	    case "BICYCLE":
	    	wyswietl(wybor, Romet.Producent, Romet.vmax);
	    break;
	    case "ALL":
	    	wyswietl(wybor, AUDI.Producent, AUDI.vmax);
	    	wyswietl(wybor, SpeedoShip.Producent, SpeedoShip.vmax);
	    	wyswietl(wybor, Latacz.Producent, Latacz.vmax);
	    	wyswietl(wybor, Romet.Producent, Romet.vmax);
	    break;
	    case "EXIT":
	    	System.exit(0);
		break;
	    default:
	    	logger.info("Podaj prawidłową opcję.");
	    break;
	    }
	    } while (!Objects.equals(wybor, "EXIT"));
	}
	
	static void wyswietl(String wybor, String prod, int max) {
		logger.info("\nPojazd " + wybor + " producenta " + prod + 
    			" jest najszybszy (maksymalna prędkość to = " + 
    			max + " km/h)");
	}

	public static void setWybor(String wybor) {
		Vehicles.wybor = wybor;
	}

	public static String getWybor() {
		return Vehicles.wybor;
	}
}