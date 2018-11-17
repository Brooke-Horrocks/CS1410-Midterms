/**
* Assignment Midterm 2
* Program: Exercise1
* Programmer: Brooke Horrocks
* Date: Jul 18, 2018
*/
/**
 * 
 */
package midterm2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


/**
 * @author Brooke
 *
 */
public class Exercise1 {

	/**
	 * Method: main
	 * @param args
	 */
	public static void main(String[] args) {
		
		/**
		 * List initialization with Character list
		 */
		List<Character> list = new ArrayList<Character>(Arrays.asList('a', '@', 'b', 'c', '#', '$'));
		
		System.out.println("Original list: " + list);
		
		char item = '&';
		int count = 1;
		
		/**
		 * Enhanced for loop to check and print if item is an element of list 
		 */
		for(Character el : list) {	
						
			if(el.equals(item) && (count == 1)) {
				System.out.println("The element '" + item + "' is part of the list.");
			}
			else if(!el.equals(item) && (count == 1)) {
				System.out.println("The element '" + item + "' is not part of the list.");
			}
			
			count++;
		}		
		
		/**
		 * Swap second and last element of list
		 */
		Collections.swap(list, 1, (list.size()-1));
		System.out.println("Modified list: " + list);
		
		/**
		 * Enhanced for loop to check and print if each element is alphabetic
		 */
		for(Character el : list) {
			System.out.print(Character.isAlphabetic(el) + " ");
		}
	}

}
