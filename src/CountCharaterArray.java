/**
 * 
   Author  : JayaKrishna
   Date    : 05/11/2020
   Desc    : CountCharaterArray
 *
 **/

import java.util.*;

public class CountCharaterArray {
	public static void main(String[] args) {
		char[] character= {'f','r','w','v','b','s','n'};
		Map<Character,Integer> charOccurence=countChars(character);
		System.out.println(charOccurence);
	}

	private static Map<Character, Integer> countChars(char[] character) {
		Map<Character,Integer> countChar=new HashMap<Character,Integer>();
		for(char ch:character) {
			if(countChar.containsKey(ch)) {
				countChar.put(ch,countChar.get(ch)+1);
			}
			else {
				countChar.put(ch,1);
			}
		}
		for(Map.Entry<Character,Integer> entry: countChar.entrySet()) {
			countChar.put(entry.getKey(),entry.getValue());
		}
		return countChar;
	}

}