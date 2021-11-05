/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import java.util.Scanner;
    class examAnalysis{
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            examAnalysis obj=new examAnalysis();    //object  method
    
            System.out.print("Enter number of students:");
            int n=sc.nextInt();     //user input
    
            String[] name=new String[n];    //array declaration
            int[] mark=new int[n];    //array declaration
    
            for(int i=0;i<name.length;i++){
                System.out.print("Enter name:");
                name[i]=sc.next();    //user input
                System.out.print("Enter mark:");
                mark[i]=sc.nextInt();   //user input
            } //end for
    
            obj.displaydata(name, mark);   //call method display data without return
            System.out.println("\nTotal mark:" + obj.totalmarks(mark));     //call method totalmarks
            System.out.println("\nHighest mark:" + obj.highestmarks(mark));     //call method highest mark
            System.out.println("\nNumber Students failed:" + obj.numfailed(mark));     //call method number students failed
    
    
        }   //end main
        
        //method displaying data
        void displaydata(String[] name, int[] mark){    //method
        System.out.println("\nSummary: ");
        System.out.println("\nName\t\t\t\t\tMark");
        for(int i=0;i<name.length;i++){
            System.out.println("\n" + name[i] + "\t\t\t\t\t" + mark[i]);
        }   //end for
        }   //end method display data

        //method finding total marks
        int totalmarks (int[] mark){     //method
            int total=0;    //initialize
            for(int i=0; i<mark.length; i++){
                total=total+mark[i];
            }   //end for
        return total;
        }   //end method total

        //method finding highest marks
        int highestmarks(int[] mark){   //method
            int highest=mark[0];
            for(int i=0; i<mark.length; i++){
                if(mark[i]>highest)
                    highest=mark[i];    
            }   //end for
        return highest;
        }   //end method highest

        //method finding number of students failed
        int numfailed(int[] mark){  //method
            int numfailed=0;    //initialize
            for(int i=0; i<mark.length; i++){
                if(mark[i]<40)
                    numfailed=numfailed+1;
            }   //end for
        return numfailed;
        }   //end method number of students failed

   
    }   //end class
            

