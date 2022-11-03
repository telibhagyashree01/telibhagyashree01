/*write a java program an to replace the second element of a Arraylist with the specified element
 name: Bhagyashree teli
 date:3/10/2022
 */

package corejava;
import java.util.*;
class Arraylist {

	public static void main(String[] args) {
		
		// let's create a list first
		 ArrayList<String> list = new ArrayList<String>();
		 
		 //Add elements to Arraylist.
	      list.add("34");
	      list.add("56");
	      list.add("98");
	      list.add("89");
	      System.out.println(list);
	      
	   // Enter the position and number for replace.
	      
	      list.set(2, "90");
	      System.out.println(list);

	}

}
