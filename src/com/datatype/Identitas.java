package com.datatype;

import java.util.Scanner;


public class Identitas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name;
        long idCard;
        int age;
        double height, weight, bmi;

        System.out.print("Input Your Name : ");
        name = input.nextLine();

        System.out.print("Input Your IdCard : ");
        idCard = input.nextLong();


        System.out.print("Input Your Age : ");
        age = input.nextInt();

        System.out.print("Input Your Address : ");
        String address = input.nextLine();
        address+=input.nextLine();


        System.out.print("Input Your Height (cm) : ");
        height = input.nextDouble();
        System.out.print("Input Your Weight (kg) : ");
        weight = input.nextDouble();



        height = height/100;
        bmi = weight / (height * height);

        String formattedBMI = String.format("%.2f", bmi);

        String bodyType;
        if (bmi < 18.5) {
            bodyType = "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            bodyType = "Normal Weight";
        } else if (bmi >= 25.0 && bmi <= 29.9) {
            bodyType = "Overweight";
        } else {
            bodyType = "Obesity";
        }

        System.out.println("Card Identity \n");
        System.out.println("------------------------");

        System.out.println("Name : " + name);
        System.out.println("Id Card : " + idCard);
        System.out.println("Age : " + age);
        System.out.println("Height : " + height);
        System.out.println("Weight : " + weight);
        System.out.println("Address : " + address);
        System.out.println("Your Body BMI : " + formattedBMI + " " + "category : " + bodyType);
    }
}
