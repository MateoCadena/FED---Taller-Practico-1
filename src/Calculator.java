import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
import java.io.IOException;         //import all the packages for some data for the program
public class Calculator {    //define the data and the conduct of all the type that this program
    public static int potencialr(int z,int x){ //a sub-process for recursion      
        if(x == 0){                 //in the sub-process look if x is equal to 0 for return to 1
            return 1;              
        }else{                      //else go to the sub-process for get the potencial
            return z * potencialr(z,x-1);
        }
    }
    public static int multiplicationr(int a1,int b2){ //this is other sub-process but in this case is for multiplication
        if(b2 == 1){ // if the variable b2 is the same of 1 back to return
            return a1;
        }else{     //if that is not the variable continue 
            return a1 + multiplicationr(a1,b2-1);
        }
    }
    public static void main(String[] args) throws IOException{ //define various methods for start the program
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));//allow read a complete line
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));//well as the reader can write a complete line like an enter
        double n1 = 0;  //accept a type of variable with a decimal number
        double n2 = 0;  //the variable can use like a counter
        double r = 0;   //the variable can use like a counter
        int a1, b2, z, x, fi, c, a, b, t, i, f, fac;   //accept only number integers and variables
        int d = 0;      //use like a counter 
        String cadena;  //use a variable like a character string
        
        bw.write("*****Select someone of the options*****"+ "\n"); //print like a menu of the calculator
        bw.newLine();   //print a empty line
        bw.write("1. Addition"+ "\n"); //print options of a menu of the calculator
        bw.write("2. Subtraction"+ "\n");    //print options of a menu of the calculator
        bw.write("3. Multiplication"+ "\n");   //print options of a menu of the calculator
        bw.write("4. Division"+ "\n");   //print options of a menu of the calculator
        bw.write("5. Potencial"+ "\n");  //print options of a menu of the calculator
        bw.write("6. Root"+ "\n"); //print options of a menu of the calculator
        bw.write("7. Module"+ "\n");    //print options of a menu of the calculator
        bw.flush();     // send all the information to the destination 
                char m1 =br.readLine().charAt(0);   //read the character that receive for the menu
                if(m1 > 7 || m1 < 0){
                    bw.write("The option is incorrect");
                    bw.flush();
                }
                else{
                    switch(m1)  //set to the variable the answer for the user
                    {
                    case '1':   //if the user choose 1 this case direct to the option
                    bw.write("Enter First Number"+ "\n");    //print one of the numbers that needs for get the result
                    bw.flush(); // send all the information to the destination
                    n1 = Integer.parseInt(br.readLine());   //save the answer in the variable with integer
                    bw.write("Enter Second Number"+ "\n");   //print one of the numbers that needs for get the result
                    bw.flush(); // send all the information to the destination
                    n2 = Integer.parseInt(br.readLine());   //save the answer in the variable with integer
                    bw.write("The result is "+ (n1+n2)+ "\n"); //print the result with the operation of the sum
                    bw.flush(); // send all the information to the destination
                    break; //break or stop a process indicate or cycles
                        
                    case '2':   //if the user choose 2 this case direct to the option
                    bw.write("Enter the minuend"+ "\n");   //print one of the numbers that needs for get the result
                    bw.flush(); // send all the information to the destination
                    n1 = Integer.parseInt(br.readLine());   //save the answer in the variable with integer
                    bw.write("Digite el subtrahend"+ "\n"); //print one of the numbers that needs for get the result
                    bw.flush(); // send all the information to the destination
                    n2 = Integer.parseInt(br.readLine());   //save the answer in the variable with integer
                    bw.write("The result is " + (n1 - n2)+ "\n");  //print the result with the operation of the subtraction
                    bw.flush(); // send all the information to the destination
                    break;  //break or stop a process indicate or cycles
                       
                    case '3':   //if the user choose 3 this case direct to the option
                       
                    bw.write("Enter the first factor");    //print one of the numbers that needs for get the result
                    bw.flush(); // send all the information to the destination
                    a1 = Integer.parseInt(br.readLine());   //save the answer in the variable with integer
                    bw.write("Enter the second factor");   //print one of the numbers that needs for get the result
                    bw.flush(); // send all the information to the destination
                    b2 = Integer.parseInt(br.readLine());   //save the answer in the variable with integer
                    bw.flush(); // send all the information to the destination
                    bw.write("The result is " + multiplicationr(a1, b2) );     //print the result and call the sub-process for the result of multiplication
                    bw.flush(); // send all the information to the destination
                    break;  //break or stop a process indicate or cycles
                        
                    case '4':   //if the user choose 4 this case direct to the option
                    bw.write("Digite el dividend");    //print one of the numbers that needs for get the result
                    bw.flush(); // send all the information to the destination
                    n1 = Integer.parseInt(br.readLine());   //save the answer in the variable with integer
                    bw.write("Digite el divider");  //print one of the numbers that needs for get the result 
                    bw.flush(); // send all the information to the destination
                    n2 = Integer.parseInt(br.readLine());//save the answer in the variable with integer
                    if(n2 == 0){
                        bw.write("It's not possible to divide a number between 0");
                        bw.flush();
                    }
                    else{
                    bw.write("The result is " + (n1 / n2));    //print the result with the operation of the division
                    bw.flush(); // send all the information to the destination
                    break;  //break or stop a process indicate or cycles
                    }
                    
                    case '5':   //if the user choose 5 this case direct to the option
                       
                    bw.write("Enter base");    //print one of the numbers that needs for get the result
                    bw.flush(); // send all the information to the destination
                    z = Integer.parseInt(br.readLine());    //save the answer in the variable with integer
                    bw.write("Enter exponent");   //print one of the numbers that needs for get the result
                    bw.flush(); // send all the information to the destination
                    x = Integer.parseInt(br.readLine());    //save the answer in the variable with integer
                    bw.flush(); // send all the information to the destination
                    bw.write("The result is " + potencialr(z, x) );    //print the result and call the sub-process for answer the result for potencial
                    bw.flush(); // send all the information to the destination
                    break;  //break or stop a process indicate or cycles
                        
                    case '6':   //if the user choose 6 this case direct to the option
                    bw.write("Enter the taking roots"+ "\n");  //print one of the numbers that needs for get the result
                    bw.flush(); // send all the information to the destination
                    n1 = Float.parseFloat(br.readLine());   //save the answer in the variable with float
                    bw.write("Enter the index"+ "\n"); //print one of the numbers that needs for get the result
                    bw.flush(); // send all the information to the destination
                    n2 = Float.parseFloat(br.readLine());   //save the answer in the variable with float
                    float rai = (float) Math.pow(n1, 1/n2); //use the operator Math.pow for calculate the root with the potencial
                    bw.write("The result is " + rai + "\n");   //print the result with the operation of the root
                    bw.flush(); // send all the information to the destination
                    break;  //break or stop a process indicate or cycles
                    
                    case '7':   //if the user choose 7 this case direct to the option
                    bw.write("Enter the dividend");    //print one of the numbers that needs for get the result
                    bw.flush(); // send all the information to the destination
                    n1 = Integer.parseInt(br.readLine()); //save the answer in the variable with integer
                    bw.write("Enter the divider");  //print one of the numbers that needs for get the result
                    bw.flush(); // send all the information to the destination
                    n2 = Integer.parseInt(br.readLine());   //save the answer in the variable with integer
                    bw.write("The result is " + (n1 % n2));    //print the result with the operation of the module
                    bw.flush(); // send all the information to the destination
                    break;  //break or stop a process indicate or cycles
                    }    
                }
    }           
}