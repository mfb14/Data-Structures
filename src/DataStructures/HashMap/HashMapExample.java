
package DataStructures.HashMap;

import java.util.HashMap;

/**
 * Practice about HashMap
 * @author Mustafa Furkan BİLEN <mustafafurkanbilen@gmail.com>
 * @since Nov 21, 2022 8:33:51 AM
 */
public class HashMapExample {

	public static void main(String[] args) {
		
		HashMap<String, String> countries = new HashMap<>();
		countries.put("Turkey", "Ankara");
		countries.put("USA", "Washington DC");
		countries.put("England", "London");
		countries.put("Russia", "Moscow");
		countries.put("Germany", "Berlin");
		
		countries.remove("Russia");
		countries.replace("USA","New York");
		System.out.println(countries.get("Russia"));
		System.out.println(countries.containsKey("England"));		
		System.out.println(countries);
		
		
		countries.forEach((k,v)->System.out.println(k+"\t:"+v));
		
		String newCountry = countries.computeIfAbsent("India", key-> "New Delhi");
		countries.forEach((k,v)->System.out.println(k+"\t:"+v));
		
		String capital = countries.compute("Turkey", (key,value)-> value.toUpperCase());
		countries.forEach((k,v)->System.out.println(k+"\t:"+v));
		
		

	}

}
