import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
import java.io.IOException; //import all the packages for some data for the program
public class punto4 {   //define the data and the conduct of all the type that this program
     public static boolean palindromor(String cadena) //create a sub-process of palindrome
	{ 
            cadena = cadena.replaceAll(" ", "");//delete the spaces of the string
		for(int i = 0; i< cadena.length(); i++){    //create cycle i since 0 until length of the string and increase 1
                    if(cadena.charAt(i) != cadena.charAt(cadena.length()-i - 1)){   //if each one of the string is different with the string since the ultimate character minus i and minus 1
                        return false;   //if the condition met return to false
                    }
                }
                return true;    //else return direct to true
	}
    
    public static void main(String[] args) throws IOException { //start the main methods
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//allow read a complete line
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //well as the reader can write a complete line like an enter   
        String cadena;  //create variable string
             bw.write("Enter the Character String");   //Print a option that answer the user
                        bw.flush(); // send all the information to the destination
                        cadena = (br.readLine());   //read the answer of the user
                        if(palindromor(cadena)== true){ // if the answer of the sub-process is true print that is correct
                        bw.write("The Character String is a Palindrome" + "\n");
                        }else{      //else print that isn't correct
                            bw.write("The Character String is`nt a Palindrome" + "\n");
                        }
                        bw.flush(); // send all the information to the destination
                        
}
}