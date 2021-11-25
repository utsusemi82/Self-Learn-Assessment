/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tutorial;

//Write the statements that display the string in reverse order. (use String.length() to get the length of the string)

public class T4E07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // TODO code application logic here
        
        String str= "Hello World";
	String nstr= " ";
	char ch;

	for(int i=0; i<str.length(); i++){
		ch=str.charAt(i);
		nstr=ch+nstr;
	}
	System.out.println(nstr);

    }
    
}
