/**************************************
 * Author: Brooke Horrocks
 * CSIS-1410 midterm1
 * 
 **************************************/

package stringStringBuilder;

public class ExerciseStringStringBuilder {

	public static void main(String[] args) {

		String[] tools = {"\tHammer", "NAIL", " saw ", "Screw"};
		StringBuilder sb = new StringBuilder();
		String toolList = "We need ";
		
		for(int j = 0; j < tools.length; j++) {
			tools[j] = tools[j].trim();			
		}
		
		for (int i = 1; i <= tools.length; i++) {
			if(!tools[tools.length - i].endsWith("s")) {
				sb.append(tools[tools.length - i].toLowerCase());
				sb.append("s");
			}
			
			else {
				sb.append(tools[tools.length - i].toLowerCase());
			}
			
			if (i <= (tools.length - 1)) {
				sb.append(", ");
			}
			
			if (i > (tools.length - 1)) {
				sb.append(" and a lot of time.");
			}
		}
		
		toolList += sb.toString();
		System.out.println(toolList);

	}

}
