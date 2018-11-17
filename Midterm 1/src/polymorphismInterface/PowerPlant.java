/**
* Assignment Midterm 1
* Program: PowerPlant
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
public class PowerPlant {
	private int capacity;
	
	public PowerPlant(int c) {
		super();
		capacity = c;
	}
	
	public String generatesElectricity() {
		return "generating electricity";
	}

	
	public String toString() {
		return String.format(this.getClass().getSimpleName() + ": " + this.getClass().getSimpleName() + " " + capacity + "MW");
	}
	
	

}
