/**
 * Author: Paige Margaret Bartusiak
 * Assignment: 2.3c
 * Date: September 12, 2018
 * 
 *ReadMe: This code takes user input in order to coplete a conversion of kilometers to nautical miles.
 */

import java.util.Scanner;

  public class Convert {
  public static void main (String [] args) {
    Scanner reader = new Scanner(System.in);
    double kilometers;
    double nautical;
    
    System.out.print("Enter distance in Kilometers: ");
    kilometers = reader.nextDouble();
    
    nautical = kilometers * 0.54;
    System.out.print("The equivalent in Nautical Miles is ");
    System.out.println(nautical);
  }
}
