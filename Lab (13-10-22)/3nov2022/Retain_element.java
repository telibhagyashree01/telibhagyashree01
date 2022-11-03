/*write a java program to compare two sets and retain elements which are same on both sets use retain all method
 name: Bhagyashree teli
 date:3/10/2022
 */

package corejava;
import java.util.*;
public class Retain_element {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
        //add elements to HashSet
        hs.add("java");
        hs.add("c");
        hs.add("c++");
        hs.add("python");
        System.out.println(hs);
        HashSet<String> subSet = new HashSet<String>();
        subSet.add("python");
        subSet.add("java");
        subSet.add("c++");
        hs.retainAll(subSet);
        System.out.println("HashSet content:");
        System.out.println(hs);
	}

}
