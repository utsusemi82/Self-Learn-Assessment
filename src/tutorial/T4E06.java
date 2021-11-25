/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tutorial;

//Write the statements that display the first ten values of the Fibonacci sequence. Given the formula f1 = 1, f2 =1, fn = fn-1 + fn-2.

public class T4E06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
	int num1=1, num2=1;
	final int max=10;
	System.out. println(num1 + "," +num2 + ",");
	for(int i=1; i<max-2;i++){
		if(i==max-2)
			System.out. println(num1+num2);
		else
			System.out.println(num1+num2+ ",");
                
                if(i%2==0)
			num2=num2+num1;
		else 
			num1=num1+num2;


		}
	}

    }
    

