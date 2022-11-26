
package DataStructures.HashMap;

import java.util.HashMap;

/**
 * 
 * @author Mustafa Furkan BİLEN <mustafafurkanbilen@gmail.com>
 * @since Nov 21, 2022 9:21:37 AM
 */
public class HashMapExampleSecond {

	public static void main(String[] args) {
		
		HashMap<String, Integer> products = new HashMap<>();
		
		products.put("Shoes", 25);
		products.put("Shirts", 20);
		products.put("Pants", 65);
		products.put("Jackets", 120);
		products.put("Laptops", 13165);
		products.put("Mouses",4523);
		
		
		
		Integer price = products.computeIfPresent("Mouses", (k,v)->v-v*59/100);
		Integer price2 = products.putIfAbsent("Pillow", 45);
		
		
		
		int newPrice = products.compute("Laptops",(k,v)-> v-v*11/100);
		products.forEach((k,v)-> System.out.println(k+"\t:"+v));
		System.out.println(newPrice);
	}

}
