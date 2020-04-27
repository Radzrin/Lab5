import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {  
  public static void main(String[] args) {  
    try {
      File myObj = new File("filename.txt");
      Scanner sc = new Scanner(myObj);  
      
      while (sc.hasNextLine()) {
        
        String name = sc.nextLine();
        int score = sc.nextInt();
       
        int max;
        int min;
        String nameMax = name;
        String nameMin = name;
        int all = 0;
        int i = 0;
        i++;
        all += score;
        int average = all/i;
        min = max = score;
        
    if(max < score){
     max = score;
     nameMax = name;
    }
    
    if(min > score){
     min = score;
     name = nameMin;
    }
      
    while (!sc.hasNextLine()) {  
      System.out.println(name +": "+ score);
      System.out.println( nameMin +"The Lowest score is "+ min);
      System.out.println(nameMax +"The highest score is "+ max);
      System.out.println("The average score is "+ average);
    }
        
      }
      sc.close();

    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } 
  }  
} 