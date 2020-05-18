package com.testcode.example;

public class LeapYear {

	public boolean isLeap(int year) {
		// TODO Auto-generated method stu
	    boolean leap = false;

	    if(year % 4 == 0){
	    	if( year % 100 == 0){// year is divisible by 400, hence the year is a leap year
	    		if ( year % 400 == 0)
	                leap = true;
	    		else
	    			leap = false;
	    	}else
	    		leap = true;
	    }
	        else
	            leap = false;
	    return leap;
	}

}
