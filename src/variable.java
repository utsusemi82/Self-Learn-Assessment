/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author User
 */
public class variable {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1, num2;
        char ch;    //variable ch declaration
        String name;
        byte age=20; //variable age declaration, assign value 20 into age
        //byte age2=129;    //not valid as it exceeds range of (-128~127)
        
        float price=12.5f;      //如果需要将某个包括小数点的实数声明为单精度，则需在该数值后加字母'f'或者'F'
        float price1=(float)12.5;
        //float price=12.5;    //invalid variable declaration
        
        double weight=12.5;
        
        
        num1=2;     //assign value to variable num1
        num2=3;     //assign value to variable num2
        ch='z';     //assign character in variable ch
        name="utsusemi";
        
        System.out.println(num1 + num2);
        System.out.println(ch);
        System.out.println(name);
        System.out.println(price);
        System.out.println(price1);
        System.out.println(age);
        System.out.println(weight);
    }
    
}
