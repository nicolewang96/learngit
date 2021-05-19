package com.company;

import java.until.*;

public class TestMap {  // at least one class and the class here is 'Main'

    public static void main(String[] args) { // this statement is compulsory
	// write your code here
        HashMap<String,Integer> scores = new HashMao<String,Integer>();
        scores.put("Kathy",42);
        scores.put("Bert",343);
        scores.put("Skyler",420);
        System.out.println(scores);
        System.out.println(scores.get("Bert"));
    }
}