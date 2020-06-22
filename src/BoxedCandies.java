import jdk.nashorn.internal.ir.WhileNode;

/**
 * Classname : BoxedCandies
 *
 * Created on 22 June 2020
 *
 * Copyright Alyona Sviridova NTU KhPI
 *
 * Laboratory Work No.2
 */

public class BoxedCandies implements ICandiesMethods {

    private double candiesBoxPrise;
    private double weight;
    private int shelfLifeByAmountDays;
    private double caloriesPerHundredGrams;

    /*
     * Constructor with 4 parameters
     * */

    public BoxedCandies(double candiesBoxPrise,
                        double weight, int shelfLifeByAmountDays,
                        double caloriesPerHundredGrams) {

        this.candiesBoxPrise = candiesBoxPrise;
        this.weight = weight;
        this.shelfLifeByAmountDays = shelfLifeByAmountDays;
        this.caloriesPerHundredGrams = caloriesPerHundredGrams;
    }

    /*
    * Getters and Setters for all class fields
    * */
    public double getCandiesBoxPrise() {
        return candiesBoxPrise;
    }

    public void setCandiesBoxPrise(double candiesBoxPrise) {
        this.candiesBoxPrise = candiesBoxPrise;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getShelfLifeByAmountDays() {
        return shelfLifeByAmountDays;
    }

    public void setShelfLifeByAmountDays(int shelfLifeByAmountDays) {
        this.shelfLifeByAmountDays = shelfLifeByAmountDays;
    }

    public double getCaloriesPerHundredGrams() {
        return caloriesPerHundredGrams;
    }

    public void setCaloriesPerHundredGrams(double caloriesPerHundredGrams) {
        this.caloriesPerHundredGrams = caloriesPerHundredGrams;
    }

    //Find prise per hundred grams
    @Override
    public double countPrise() {
        return getCandiesBoxPrise() / getWeight() * 100;
    }

    //Find calories in candies box
    @Override
    public double countCalories() {
        return 100 / getCaloriesPerHundredGrams() * getWeight();
    }

    //Find normal amount candies per day (in grams)
    @Override
    public double normalAmountCandiesPerDay() {
        int amountGrams = 1;
        double calories;
        do {
            amountGrams++;
            calories = amountGrams * (countCalories() / getWeight());
        } while (calories < 1250);
            return calories;
    }
}