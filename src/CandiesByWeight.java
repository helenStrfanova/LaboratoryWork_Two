/**
 *
 * Classname : CandiesByWeight
 *
 * Created on 22 June 2020
 *
 * Copyright Alyona Sviridova NTU KhPI
 *
 * Laboratory Work No.2
 */
public class CandiesByWeight implements ICandiesMethods {

    private double prisePerHundredGrams;
    private double weight;
    private int shelfLifeByAmountDays;
    private double caloriesPerHundredGrams;

    /*
     * Constructor with 4 parameters
     * */
    public CandiesByWeight(double prisePerHundredGrams,
                           double weight, int shelfLifeByAmountDays,
                           double caloriesPerHundredGrams) {

        this.prisePerHundredGrams = prisePerHundredGrams;
        this.weight = weight;
        this.shelfLifeByAmountDays = shelfLifeByAmountDays;
        this.caloriesPerHundredGrams = caloriesPerHundredGrams;
    }

    /*
    * Getters and Setters for all class fields
    * */
    public double getPrisePerHundredGrams() {
        return prisePerHundredGrams;
    }

    public void setPrisePerHundredGrams(double prisePerHundredGrams) {
        this.prisePerHundredGrams = prisePerHundredGrams;
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

    //Find prise
    @Override
    public double countPrise() {
        return getPrisePerHundredGrams() * getWeight();
    }

    //Find calories
    @Override
    public double countCalories() {
        return getCaloriesPerHundredGrams() * getWeight();
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
