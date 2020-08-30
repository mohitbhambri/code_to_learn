package com.java.codingchallenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopNCompetitors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = java.lang.System.currentTimeMillis();
		List<String> reviews = Arrays.asList("newshop is providing gud services","everyone should use newshop", 
				"best services by newshop", "fashionbeats has new services", " i am proud user of fashionbeats", 
				"mymarket has awesome services", "mymarket has good repo");
		List<String> competitors = Arrays.asList("newshop","fashionbeats","mymarket","jabong","flipkart","amazon");
		TopNCompetitors topCall = new TopNCompetitors();
		
		System.out.println(topCall.topKFrequent(6, competitors, 2, reviews, 6));
		long endTime = java.lang.System.currentTimeMillis();
		long timeTaken = endTime-startTime;
		System.out.println("Time taken to run the program: "+timeTaken);
	}
	
	 public List<String> topKFrequent(int numOfCompetitors, List<String> competitors, 
			 int topKCompetitors, List<String> reviews , int numReviews) 
	    {
		 	//List<String> response = new ArrayList<>();
	        HashMap<String, Integer> frequency = new HashMap<String, Integer>();
	        competitors.stream().forEach(value -> {
	        	reviews.stream().forEach(review -> {
	        		if (review.contains(value)) {
	        		frequency.put(value, frequency.getOrDefault(value, 0) + 1);
	        	}});
	        });
	        
	        List<String> candidates = new ArrayList(frequency.keySet());
	        Collections.sort(candidates, (w1, w2) -> frequency.get(w1).equals(frequency.get(w2)) ?
	                w1.compareTo(w2) : frequency.get(w2) - frequency.get(w1));
	        
	        return candidates.subList(0, topKCompetitors);
	        //System.out.println("Printing hashmap: "+frequency);
	        
//	        if (topKCompetitors > frequency.size())
//	        {
//	        	frequency.keySet().stream().forEach(key -> response.add(key));  	
//	        }else {
//	        
//	        int count =0;
//	        while(count < topKCompetitors) {
//		        int maxValue =0;
//		        String winner ="";
//	        	for(Map.Entry<String, Integer> mapEntry : frequency.entrySet()) {
//	        		if(mapEntry.getValue() > maxValue) {
//	        			maxValue = mapEntry.getValue();
//	        			winner = mapEntry.getKey();
//	        		}else if(mapEntry.getValue() == maxValue && winner.compareTo(mapEntry.getKey()) > 0) {
//	        			winner = mapEntry.getKey();
//	        		}
//	        	}
//	        	response.add(winner);
//	        	frequency.remove(winner);
//	        	count++;
//	        }
//	        }
	        
	       //return response; 
	    }
}

