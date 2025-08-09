package com.wipro.stream;
import java.util.*;
import java.util.stream.Collectors;

public class food {
	
	    private String foodName;
	    private String foodType; // Veg or Non-Veg
	    private String cuisine;

	    public food(String foodName, String foodType, String cuisine) {
	        this.foodName = foodName;
	        this.foodType = foodType;
	        this.cuisine = cuisine;
	    }

	    public String getFoodName() {
	        return foodName;
	    }

	    public String getFoodType() {
	        return foodType;
	    }

	    public String getCuisine() {
	        return cuisine;
	    }

	    @Override
	    public String toString() {
	        return foodName + " (" + foodType + ", " + cuisine + ")";
	    }
	}


public class Streamfood {
    public static void main(String[] args) {

        FoodItem f1 = new FoodItem("Spring Roll", "Veg", "Chinese");
        FoodItem f2 = new FoodItem("Green Curry", "Veg", "Thai");
        FoodItem f3 = new FoodItem("Chicken Wings", "Non Veg", "Continental");
        FoodItem f4 = new FoodItem("Pad Thai", "Veg", "Thai");
        FoodItem f5 = new FoodItem("Chicken Satay", "Non Veg", "Thai");

        List<FoodItem> foodList = Arrays.asList(f1, f2, f3, f4, f5);

        // Example: Filter Thai food and sort by foodName
        List<FoodItem> thaiFoods = foodList.stream()
                .filter(f -> f.getCuisine().equalsIgnoreCase("Thai"))
                .sorted(Comparator.comparing(FoodItem::getFoodName))
                .collect(Collectors.toList());

        System.out.println("Thai Cuisine Items:");
        thaiFoods.forEach(System.out::println);
    }
}
