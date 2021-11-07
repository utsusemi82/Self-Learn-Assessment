/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.io.*;   //导入Java中支持I/O类的包
    public class StreamInTest {

        /**
        * @param args the command line arguments
        */
        public static void main(String[] args) {
            // TODO code application logic here
            String str;
            
//创建标准输入流对象stdin来接受键盘System.in的输入
            InputStreamReader stdin=new InputStreamReader(System.in);
            
            //以缓冲流模式来接受stdin
            BufferedReader bufin=new BufferedReader(stdin);
            
            //使用try 和catch机制来处理输入的异常
            try{
                
                System.out.println("Please enter input:");
                
                //用str来接受键盘输入的一行数据
                str=bufin.readLine();
                
                System.out.println("Your enter input is " + str);
               
                }catch(IOException e){
                    
                    //System.out.println("Invalid I/O!!!");
                    System.err.println("Invalid I/O!!!");
                    e.printStackTrace();
                }
    }
    
}
