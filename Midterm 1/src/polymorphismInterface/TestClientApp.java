/**************************************
 * Author: Brooke Horrocks
 * CSIS-1410 midterm1
 * 
 **************************************/

package polymorphismInterface;

public class TestClientApp {

	public static void main(String[] args) {

		PowerPlant myPowerPlant = new PowerPlant(100);
		SolarPowerPlant mySolarPowerPlant = new SolarPowerPlant(200);
		HydroPowerPlant myHydroPowerPlant = new HydroPowerPlant(900, true);
		
		System.out.println(myPowerPlant);
		System.out.println(mySolarPowerPlant);
		System.out.println(myHydroPowerPlant);
		
		if(myHydroPowerPlant.hasDam()) {
			System.out.println("HydroPowerPlant has a dam");
		}
		else {
			System.out.println("HydroPowerPlant does not have a dam");
		}
		
		System.out.printf("%nDemo Polymorphism:%n");
		
		PowerPlant[] myPowerPlants = {myPowerPlant, mySolarPowerPlant, myHydroPowerPlant};
		
		for(PowerPlant p : myPowerPlants) {
			System.out.println(p.generatesElectricity());	
		}
	}

}
