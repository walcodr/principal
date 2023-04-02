package com.principal_demo;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.ObjectMapper;
  
public class App {

    public static void main(String[] args) throws JsonParseException, IOException 
    {
    	
    	try {
    		int reviewTotalScore = 0;
    		int reviewScore;
    		
	        ObjectMapper objectMapper = new ObjectMapper();
	        
	        UserReview[] reviews = objectMapper.readValue(new File("data/feedback.json"), UserReview[].class );

	        Keyword[] keywordRecs = objectMapper.readValue(new File("data/keywords.json"), Keyword[].class );
	        
	        for (UserReview review : reviews) {
        	reviewScore = 0;
        	
	        System.out.println("Current comment: " + review.getComment().toLowerCase());
	        
	        for (Keyword k : keywordRecs) {
	        	if (review.getComment().toLowerCase().contains(k.getKeyword())) {
	        		reviewScore = reviewScore + k.getEmphasis();
	        	}
	        	
	        }
	        System.out.println("This review's score is: " + reviewScore + "\n");
	        reviewTotalScore = reviewScore + reviewTotalScore;
	        }

	        System.out.println("The total restaurant's score is: " + reviewTotalScore);
        
    	}
    	catch (Exception ex) {
    		ex.printStackTrace();
    	}
        
    }
}