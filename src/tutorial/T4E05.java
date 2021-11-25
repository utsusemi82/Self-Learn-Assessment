/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tutorial;

// Compute the sum of the series: 1/25+2/24+3/23 … + 25/1 in two decimal places.

public class T4E05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       double sum=0;
       for(int i=25,j=25-i+1; i>0; i--,j++){
           sum = (double) (j/i*1.0) + sum;
        }
    　　
        System.out.printf("%6.2f",sum);

    }
}
