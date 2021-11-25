/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tutorial;

import java.util.Random;

//Display a 4-by-5 matrix using random numbers within 0 to 100.
public class T4E03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rand=new Random();
        for(int i=0; i<4; i++){
                System.out.print(rand.nextInt(100) + " ");
                System.out.print(rand.nextInt(100) + " ");
                System.out.print(rand.nextInt(100) + " ");
                System.out.print(rand.nextInt(100) + " ");
                System.out.print(rand.nextInt(100) + "\n");
    }
        
        //nested loop
        for(int i=0; i<4; i++){
            for(int j=0; j<5; j++){
                System.out.print(rand.nextInt(100));
                if(j!=4){
                    System.out.print(" ");
                 
                }else{
                    System.out.print("\n");
                }
            }
        }
    }
}
