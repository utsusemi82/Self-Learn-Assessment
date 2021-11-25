/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tutorial;

//Find the largest integer n so that n3 is less than 2000.

public class T4E01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        for(int n=1; (n * n * n)<2000; n ++){
           int num = n + 1;
           if((num * num * num)>2000){
            System.out.println(n);
            
        }
    }
    
}}
