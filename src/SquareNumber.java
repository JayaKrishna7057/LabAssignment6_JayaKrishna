/**
 * 
   Author  : JayaKrishna
   Date    : 05/11/2020
   Desc    : SquareNumber
 *
 **/

import java.util.*;

public class SquareNumber {
	public static void main(String[] args) {
		int sqNum[]= {7,5,9,2,3,6};
		Map<Integer,Integer> squareNum=getSquares(sqNum);
		System.out.println(squareNum);
		
	}

	private static Map<Integer, Integer> getSquares(int[] sqNum) {
		
		Map<Integer,Integer> squareMap=new HashMap<>();
		for(int square:sqNum) {
			squareMap.put(square,square*square);
		}
		return squareMap;
	}

}