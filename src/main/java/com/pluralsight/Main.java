package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //prompt for customer details
        System.out.println("Please enter your full name: ");
        String fullName = input.nextLine();

        //Billing info
        System.out.println("Billing street: ");
        String billingStreet = input.nextLine();

        System.out.println("Billing City: ");
        String billingCity = input.nextLine();

        System.out.println("Billing State: ");
        String billingState = input.nextLine();

        System.out.println("Billing Zip: ");
        String billingZipCode = input.nextLine();

        //Shipping info
        System.out.println("Shipping Street: ");
        String shippingStreet = input.nextLine();

        System.out.println("Shipping City: ");
        String shippingCity = input.nextLine();

        System.out.println("Shipping State: ");
        String shippingState = input.nextLine();

        System.out.println("Shipping Zip: ");
        String shippingZip = input.nextLine();

        //build string with StringBuilder
        StringBuilder sb = new StringBuilder();

        //add full name first
        sb.append(fullName).append("\n");

        //add billing address
        sb.append("Billing Address: \n");
        sb.append(billingStreet).append("\n");
        sb.append(billingCity).append(",")
            .append(billingState).append(" ")
            .append(billingZipCode).append("\n\n");  // \n\n adds a blank line

        //add shipping address
        sb.append("Shipping Address: \n");
        sb.append(shippingStreet).append("\n");
        sb.append(shippingCity).append(",")
          .append(shippingState).append(" ")
          .append(shippingZip).append("\n");

        //Display
        System.out.println("\nCustomer Information:");
        System.out.println(sb);

    }
}
