
package DataStructures.HashMap;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @link https://www.hackerrank.com/challenges/phone-book/problem
 * @author Mustafa Furkan BİLEN <mustafafurkanbilen@gmail.com>
 * @since Nov 21, 2022 10:07:01 AM
 */
public class HashMapHackerrankExample {
//	Sample Input
//	3
//	uncle sam
//	99912222
//	tom
//	11122222
//	harry
//	12299933
//	uncle sam
//	uncle tom
//	harry
//	
//	Sample Output
//	uncle sam=99912222
//	Not found
//	harry=12299933
	public static void main(String[] args) {
		
		HashMap<String, Integer> phoneBook = new HashMap<>();
		
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
			phoneBook.put(name, phone);
			in.nextLine();
		}
		System.out.println();
		while(in.hasNext())
		{
			String s=in.nextLine();
			if(phoneBook.containsKey(s)) {
				System.out.println(s+" ="+phoneBook.get(s));
			}
				
			else {
				System.out.println("Not Found");
			}
		}
		
	}
}
