package com.java.codingchallenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Ch07AnagramList {

	public static void main(String[] args) {
		String [] arr = {"are", "era", "pat", "tap", "bat", "tab", "ear"};
		System.out.println(groupAnagrams(arr));

	}
	
	public static List<List<String>> groupAnagrams(String[] strs) {
		Map<String, LinkedList<String>> anagramMap = new HashMap<String, LinkedList<String>>();
		for(String str : strs) {
			char[] chArray = str.toCharArray();
			Arrays.sort(chArray);
			String key = new String(chArray);
			LinkedList<String> group;
			if(anagramMap.containsKey(key)) {
				group = anagramMap.get(key);
			}else {
				group = new LinkedList<String>();
				anagramMap.put(key, group);
			}
			group.add(str);
			
		}
		return new LinkedList<List<String>>(anagramMap.values());
		
    }

}
