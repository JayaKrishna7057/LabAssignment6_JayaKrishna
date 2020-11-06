/**
 * 
   Author  : JayaKrishna
   Date    : 05/11/2020
   Desc    : SecondSmallest
 *
 **/

import java.util.*;

public class SecondSmallest {
	public static void main(String[] args) {
		Integer numArray[]= {25,55,13,77,9,75};
		int secondSmallestElement=getSecondSmallest(numArray);
		System.out.println("Second Smallest element is : "+secondSmallestElement);
	}

	private static int getSecondSmallest(Integer[] numArray) {
		List<Integer> element=Arrays.asList(numArray);
		Collections.sort(element);
		System.out.println("Sorting Array\n"+element);
		Integer secondSmallest=element.get(1);
		return secondSmallest;
	}

}