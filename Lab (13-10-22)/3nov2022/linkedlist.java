/*
 * 
 */

package corejava;
import java.util.*;
class linkedlist {

	public static void main(String[] args) 
	{
		// Creating LinkedList of String Elements
	    LinkedList<String> linkedlist = new LinkedList<String>();
	 
	    // Populating it with String values
	    linkedlist.add("nivi");
	    linkedlist.add("payal");
	    linkedlist.add("moni");
	    linkedlist.add("damu");

	    // contains() method checks whether the element exists
	    if (linkedlist.contains("payal")) {
	       System.out.println("Element payal is present in List");
	    } else {
	       System.out.println("List doesn't have element payal");
	     }
	    
	    //Checking for element 
	    if (linkedlist.contains("samu")) {
	       System.out.println("Element samu is present in List");
	    } else {
	        System.out.println("List doesn't have element ");
		    }
	
	}

}
