package com.collection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CollectionOf {

	public static void main(String[] args) {
		Map<String, String> dictionary=new LinkedHashMap<String, String>();
		dictionary.put("Ability","Capability");
		dictionary.put("Angry","Furious");
		dictionary.put("Create","Generate");
		dictionary.put("Example","Illustration");
		dictionary.put("great","Exceptional");
		
		
		Set<String> keys=dictionary.keySet();
		System.out.println("Words in the dictionary: ");
		for(String words:keys) {
			System.out.println(words);
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("Search the meaning of word by tpying the word: ");
		String word=sc.next();
		System.out.println("Meaning is: "+dictionary.get(word));

	}

}