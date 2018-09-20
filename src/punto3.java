import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
import java.io.IOException; //import all the packages for some data for the program
public class punto3 { //define the data and the conduct of all the type that this program
    public static void main(String[] args) throws IOException {//start all the program except the sub-process
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   //allow read a complete line
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //well as the reader can write a complete line like an enter   
        String cadena; //create variable for character string
        char[]cad; //create variable for character
        char car; 
        int cont=0; //create a counter
        bw.write("Enter the Character String"); //Print a option that answer the user
        bw.flush(); // send all the information to the destination 
            cadena=br.readLine();    //read the answer of the user
            cad = cadena.toCharArray(); //convert of character string to the arrays
            for(int i = 0; i < cad.length; i++ ){ //for variable i since 0 to the length of the string and increase in 1
            car=cad[i]; //change to other variable with variable i
            for(int a = 0; a< cad.length;a++ ){     //for variable a since 0 to the length o the string and increase in 1
                if(cad[a]==car){    //if the variable with a is equal to variable car
                   cont+= 1;   //increase 1 to the cont
                }
            }     
        bw.write(cad[i]+" "+cont);  //print variable cad with variable i
        bw.newLine();   //print a empty line
        cont=0; //convert the cont in 0
        bw.flush(); // send all the information to the destination
        }
    } 
}