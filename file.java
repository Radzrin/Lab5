import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class file {  
  public static void main(String[] args) {  
    try {
      File myObj = new File("filename.txt");
      Scanner sc = new Scanner(myObj);  
      
      while (sc.hasNextLine()) {
        
        String name = sc.nextLine();
        int score = sc.nextInt();
       
	   // variable declarations
        int max;
		String nameMax = name;
		String nameMin = name;
        int min;
        int all = 0;
        int i = 0;
        i++;
        all += score;
        int average = all/i;
        min = max = score;
    
 // sorts out the minimum score and the maximum    
    if(max < score){
     max = score;
	 nameMax = name;
    }
    
    if(min > score){
     min = score;
	 nameMin = name;
    }
     
// outputs the min/max/average score	 
    while (!sc.hasNextLine()) {  
      System.out.println(nameMin +" has the Lowest score with "+ min);
      System.out.println(nameMax +" has the Lowest score with "+ max);
      System.out.println("The average score is "+ average);
    break;}
        
      }
      sc.close();

    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } 
  }  
} 