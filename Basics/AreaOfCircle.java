package Basics;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        // Program to calculate area of circle
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Radius: ");
        double radius = sc.nextDouble();
        
        // Use the built-in Math.PI constant for higher accuracy
        double area = Math.PI * radius * radius; 
        
        System.out.println("Area is: " + area);
        
        // Close the scanner resource
        sc.close();
    }
}
