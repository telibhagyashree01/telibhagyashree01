/*
 
 */

package corejava;
import java.util.*;
public class Treeset {

	public static void main(String[] args) {
		 // creating TreeSet 
		   TreeSet <Integer>tree_num = new TreeSet<Integer>();
		   TreeSet <Integer>treeheadset = new TreeSet<Integer>();
		     
		   // Add numbers in the tree
		   tree_num.add(9);
		   tree_num.add(22);
		   tree_num.add(98);
		   tree_num.add(89);
		   tree_num.add(16);
		   tree_num.add(70);
		   tree_num.add(82);
		   tree_num.add(49);
		   tree_num.add(14);
		   
		   System.out.println("Strictly greater than 9 : "+tree_num.higher(9));
		   System.out.println("Strictly greater than 98 : "+tree_num.higher(98));
		   
	}

}
