/**
*This program prompts the user for two intergers and finds their biggest common divisor
*
*@author Christopher Benson
* 
*
*@since 2020-04-23
*/
import java.util.Scanner;

public class Gcd
{
	/**
	*@param
	*/
	public static void main(String[] args) {
	    
	    
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Please put in 2 intergers");
	    System.out.println("");
	    
	    
	    while (!sc.hasNextInt()){
	        sc.nextLine();
	        System.out.println("invalid. Please put in two intergers");
	        System.out.println("");
	    }
        
        int interger1 = sc.nextInt();
        int interger2 = sc.nextInt();
        int gcd = 1;
                
        for(int i = 1; i <= interger1 && i <= interger2; i++){
            
            if(interger1%i==0 && interger2%i==0){
            
            gcd = i;
            }
        }
        System.out.println("The Greatest common divisor is  " + gcd);
	}
}
