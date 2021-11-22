/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

public class TestLocalVar4_5 {

    /**
     * @Description: 变量的综合使用
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int outer=1;
        {
            int inner=2;
            System.out.println("inner="+inner);
            System.out.println("outer="+outer);
        }
        //System.out.println("inner="+inner);
        int inner=3;
        System.out.println("inner="+inner);
        System.out.println("outer="+outer);
        
        System.out.println("In class level,x="+x);
    }
    static int x=10;
    
}
