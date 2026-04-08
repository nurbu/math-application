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

        // Finding the area of a circle whose radius is 7.25

        double radius = 7.25;
        double area = Math.PI * (radius * radius);
        System.out.println("The Area of the radius: 7.25 is " + area);

        // Finding the square root of 5.0

        double radicand = 5.0;
        double squareRoot = Math.sqrt(radicand);
        System.out.println("The Square Root of the radicand is " + squareRoot);

        // Finding the distance between Point1: (5,10) and Point2: (85,50).

        double point1X = 5;
        double point1Y = 10;
        double point2X = 85;
        double point2Y = 50;
        double distance = Math.sqrt(Math.pow((point2X - point1X), 2) + Math.pow((point2Y - point1Y), 2));
        System.out.println("The distance between point 1 and Point 2 is " + distance);

    }
}
