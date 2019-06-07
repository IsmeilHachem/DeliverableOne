import java.util.Scanner;

public class WhatToEat {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String eventType = "";
		int partySize = 0;
		String result = "";

		partySize = scnr.nextInt();
		String mealSuggestion = "";
		String prepSuggestion = "";

		if ((partySize > 0) && (partySize < 2)) {
			eventType = "casual";
			mealSuggestion = "sandwiches";
			prepSuggestion = "in the microwave";
		} 
		else if ((partySize > 1) && (partySize <= 12)) {
			eventType = "formal";
			mealSuggestion = "chicken parmesan";
			prepSuggestion = "in your kitchen";
		} 
		else if (partySize >= 13) {
			eventType = "semi-formal";
			mealSuggestion = "fried chicken";
			prepSuggestion = "by a caterer";
		}

		result = result.concat("Since you're hosting a " + eventType + " event for " + partySize + " participants, " + "you should serve " + mealSuggestion + " prepared " + prepSuggestion + ".");

		System.out.println(result);

	}

}