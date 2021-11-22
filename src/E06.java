/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;
public class E06{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		float diameter, circumference;
		
		System.out.print("Enter diameter: ");
		diameter = sc.nextFloat();
		 
		circumference = (float) (Math.PI * diameter);
		System.out.printf("The circumference of the circle is :" + "%6.3f",circumference);
	}
}


