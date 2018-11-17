/**
* Assignment Midterm 1
* Program: SolarPowerPlant
* Programmer: Brooke Horrocks
* Date: Jun 16, 2018
*/
/**
 * 
 */
package polymorphismInterface;

/**
 * @author Brooke
 *
 */
public class SolarPowerPlant extends PowerPlant {
	
	public SolarPowerPlant(int c) {
		super(c);
	}
	
	@Override
	public String generatesElectricity() {
		return "generating electricity from the sun";
	}

}
