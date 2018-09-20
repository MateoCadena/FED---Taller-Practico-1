import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.*;
import java.io.IOException; //import all the packages for some data for the program
public class Punto2 {   //define the data and the conduct of all the type that this program
    public static int fibonaccir(int f){    //a sub-process for recursion of the different series like fibonacci
    if (f <= 1){ //comment that if the variable result minus or equal that 1 back to return
        return 1;
    }else{      //else that not condition comply start the sub-process
        return fibonaccir(f-1) + fibonaccir(f-2);
        }
    }
    public static int factorialr(int fac){  //a sub-process for recursion of the different series like factorial
    if(fac > 1){    //if the variable fac is greater than 1 for return to start the sub-process
	return fac * factorialr(fac - 1);   
    }else{      //else that return to 1
	return 1;
	}
    }
    
    public static long Pascalr (int num, int j){ //other sub-process for recursion abot the triangle of pascal
    if (j == 0 || j == num){    //if the variable j have some of the 2 options return to 1
        return 1;
    }else{  //else return to start for complete the sub-process 
        return Pascalr(num-1,j-1) + Pascalr(num-1,j);
        }
    }
     public static void main(String[] args) throws IOException{ //start all the program except the sub-process
        int f, fac, j, k, e; //save the variable like a integer
        int i = 0; //save the variable like a counter 
     
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in)); //allow read a complete line
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //well as the reader can write a complete line like an enter
        bw.write("*****Select someone of the options*****"+ "\n"); //print like a menu of the series
        bw.newLine();   //print a empty line
        bw.write("1. Fibonacci"+ "\n"); //print options of a menu of the series
        bw.write("2. Factorial"+ "\n"); //print options of a menu of the series
        bw.write("3. Triangle of Pascal"+ "\n");   //print options of a menu of the series
        bw.flush(); // send all the information to the destination 
                char m2 =br.readLine().charAt(0);   //read the character that receive for the menu
                    switch(m2)   //set to the variable the answer for the user
                    {
                    case '1':     //if the user choose 1 this case direct to the option                              
                        bw.write("Enter the number");   //print one of the numbers that needs for get the result
                        bw.flush(); // send all the information to the destination
                        f = Integer.parseInt(br.readLine());    //save the answer in the variable with integer
                        bw.write(fibonaccir(f) + "\n"); //print and call the sub-process and realize the fibonacci serie
                        bw.flush(); // send all the information to the destination
                        break;    //break or stop a process indicate or cycles
                 
                    case '2':    //if the user choose 2 this case direct to the option
                        bw.write("Enter the number");   //print one of the numbers that needs for get the result
                        bw.flush(); // send all the information to the destination
                        fac = Integer.parseInt(br.readLine());  //save the answer in the variable with integer
                        bw.write(factorialr(fac) + "\n"); //print and call the sub-process and realize the factorial serie
                        bw.flush(); // send all the information to the destination
                        break;  //break or stop a process indicate or cycles
                            
                            
                    case '3':    //if the user choose 3 this case direct to the option
                    	for(int x=0; x< 20; x++){//for variable x do the same to 0, and continue until x smaller than 20,and x increased to 1	
                        for(int a=0; a <=x; a++)// for variable a do the same to 0, and continue until a smaller than x ,and a increased to 1
                        bw.write(Pascalr(x,a)+" ");//print the pascal triangle called the other sub-process
                        bw.newLine(); //print a line empty for the form
                        bw.flush(); // send all the information to the destination
                        break;  //break or stop a process indicate or cycles
                        }
                        

}
}
}
