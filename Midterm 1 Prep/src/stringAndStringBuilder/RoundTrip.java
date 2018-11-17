package stringAndStringBuilder;

public class RoundTrip {
	public static void main(String[] args) {
		
		String[] cities = {"Berlin", "Weimar", "Heidelberg", "Muenchen"};
		StringBuilder sb = new StringBuilder();
		String citiesList = "From ";
		
		for (int i = 0; i < cities.length; i++) {
			sb.append(cities[i]);
			if (i < (cities.length - 1)) {
				sb.append(" to ");
			}
			if (i == (cities.length -1)) {
				sb.append(" and back to " + cities[0] + ".");
			}
		}
		
		citiesList += sb.toString();
		System.out.println(citiesList);
		
	}
}
