import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
import java.io.IOException;  
public class punto5{
    public static void anagrama(String primero,String cadena)throws IOException{ //is a function recursive for the point
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));//allow read a complete line
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));//well as the reader can write a complete line like an enter
    	if(cadena.length()==2) { //Create the cycle if for start with the anagrams
            bw.write(primero+cadena.charAt(1)+""+cadena.charAt(0)+ "\n"); //Write some anagrams possibles
            bw.flush();  // send all the information to the destination 
            bw.write(primero+cadena.charAt(0)+""+cadena.charAt(1)+ "\n"); //Write some anagrams possibles
            bw.flush();  // send all the information to the destination 
            }else{    		
                for (int i=0;i<cadena.length();i++) {
    		anagrama(primero+cadena.charAt(i),recorrer(cadena,i));
    		}
            }    
        }
    public static String recorrer(String cadena,int i){
    	if(i==0){
            return cadena.substring(i+1,cadena.length());
            }else{
    		if(i==cadena.length()){
    			return cadena.substring(0,cadena.length()-1);
    		}else{
    			return cadena.substring(0,i)+cadena.substring(i+1,cadena.length());
    		}
            }
        }  
        public static void main(String[] args) throws IOException{ //define various methods for start the program
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));//allow read a complete line
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));//well as the reader can write a complete line like an enter
        String cadena;
        bw.write("digite el anagrama"+ "\n");
        bw.flush();  // send all the information to the destination 
        cadena=br.readLine();
    	anagrama("",cadena);
    }
}