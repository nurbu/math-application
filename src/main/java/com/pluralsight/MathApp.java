package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        // Finding the highest salary between Bob and Gary

        double bobSalary = 40200;
        double garySalary = 12000.12;
        double highestSalary = Math.max(bobSalary, garySalary);

        System.out.println("The Highest salary is: $" + highestSalary);

        // Finding the lower price between a car and truck.

        double carPrice = 3002.0;
        double truckPrice = 3012.12;
        double lowestPrice = Math.min(truckPrice, carPrice);
        System.out.println("Lowest price vehicle is: $" + lowestPrice);

        //
    }
}
