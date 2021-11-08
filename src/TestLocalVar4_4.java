/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

//@Description:局部变量的作用域
public class TestLocalVar4_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        //main method 参数列表定义的局部变量args
                                                    //args主要用途是从命令行读取输入的参数
        int sum=0;      //main method body declaration的局部变量sum
        for(int i=1;i<=5;i++){       //for loop body declaration 的局部变量i
            sum=sum+i;
            System.out.println("i="+i+"; sum="+sum);
            
        }
    }
    
}
