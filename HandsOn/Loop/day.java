/*
 program to demonstrate switch and printing day
 name:bhagyaashree_teli
 date:- 11/10/22 
 */
package javaexample;
import java.util.Scanner;
public class day {

	public static void main(String[] args) 
	
	{
		
		        int day = 3; 
		        String dayString; 
		        
		        switch (day)
		        { 
		        // Case 
		        case 1: 
		            dayString = "Monday"; 
		            break; 
		  
		        case 2: 
		            dayString = "Tuesday"; 
		            break;
		            
		        case 3: 
		            dayString = "Wednesday"; 
		            break; 
		  
		        case 4: 
		            dayString = "Thursday"; 
		            break; 
		 
		        case 5: 
		            dayString = "Friday"; 
		            break; 
		            
		        case 6: 
		            dayString = "Saturday"; 
		            break; 
		  
		        case 7: 
		            dayString = "Sunday"; 
		            break; 
		  
		        // Default case 
		        default: 
		            dayString = "Invalid day"; 
		        } 
		        System.out.println(dayString); 
		    } 
	}

