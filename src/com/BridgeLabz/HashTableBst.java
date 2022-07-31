package com.BridgeLabz;
import java.util.HashMap;
import java.util.Set;
public class HashTableBst {
	static void sentence(String inputString){

		HashMap<String, Integer> count = new HashMap<String,Integer>();
		String[] words = inputString.split(" ");

		for(String word : words){
			if(count.containsKey(word)){
				count.put(word, count.get(word)+1);             
			}
			else{
				count.put(word, 1);
			}
		}
		Set<String> wordsInString = count.keySet();
		System.out.println("Frequency of words in sentence 'Paranoids are not paranoid because"
				+ " they are paranoid but because they keep putting themselves deliberately into"
				+ " paranoid avoidable situations' is");
		for(String word : wordsInString){
			if(count.get(word)>1){				
				System.out.println(word+" : "+count.get(word));
			}
		}
	}
	public static void main(String args[]){
		sentence("Paranoids are not paranoid because they are paranoid but because "
				+ "they keep putting themselves deliberately into paranoid avoidable situations");
	}
}