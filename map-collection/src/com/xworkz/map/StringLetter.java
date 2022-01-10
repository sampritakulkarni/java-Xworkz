package com.xworkz.map;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.*;


public class StringLetter {

	
	

	
		
		public static void main(String args[]) {
			
			String name="aakkdjiief";
			
			Map<Character,Integer> map=new HashMap<Character,Integer>();
			
			char[] charArray=name.toCharArray();
			
			for(char letter:charArray) {
				
				if(map.containsKey(letter)) {
					Integer value=map.get(letter);
					value++;
					map.put(letter, value);
				}
				else {
					
					map.put(letter, 1);
				}
			}
			

			
			Map<Character,Integer> treemap=new TreeMap<Character,Integer>(map);
			
			Set<java.util.Map.Entry<Character, Integer>> entryset=treemap.entrySet();
			
			for(java.util.Map.Entry<Character, Integer> entry:entryset) {
				
				System.out.println(entry);
			}
		}

	}

