/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

//@Description: Assign variable
public class TestJavaIntChar4_2 {

       public static void main(String[] args) {
           
           int num=3;
           char ch='z';
           int newNum=8;
           num=newNum;      //num=8; 变量的值永远以最后更新为准
                            //num=newNum != int num=newNum
           
           System.out.println(num + " is a whole number!");     //output value of variable num
           System.out.println(ch + " is a character!");     //output value of variable ch
    }
    
}
