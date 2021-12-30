
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author User
 */
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter First Integer: ");
        int num1=sc.nextInt();
        
        System.out.print("Enter Second Integer: ");
        int num2=sc.nextInt();
        
        int sum=num1+num2;
        
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum );
        
    }
    
}
