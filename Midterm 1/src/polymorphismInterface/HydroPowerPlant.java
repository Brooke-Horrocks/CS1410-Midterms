/**
* Assignment Midterm 1
* Program: HydroPowerPlant
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
public class HydroPowerPlant extends PowerPlant {
	
	private boolean dam;
	
	public HydroPowerPlant(int c, boolean d) {
		super(c);
		dam = d;
	}
	
	public boolean hasDam() {
		return dam;
	}
	
	@Override
	public String generatesElectricity() {
		return "generating electricity from water";
	}

}
