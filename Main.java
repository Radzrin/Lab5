/**
*This program find a file named filename.txt and then outputs the name and
*scores of eacher person in the file
*
*@author Christopher Benson
* 
*
*@since 2020-04-26
*/

public class Main
{

  private String title;
  private String author;
  private static String publisher = "Vanier";
  private int YearOfPublishing;
  private int ISBN;
  private int ammountOfBooks = 0;


  public Main () {
  
    this.title = "none";
    this.author = "none";
    this.YearOfPublishing = 0;
    this.ISBN = 0;
  }

  public Main (String title, String author, int YearOfPublishing, int ISBN, int ammountOfBooks){
	       
    this.title = title;
    this.YearOfPublishing = YearOfPublishing;
    this.author = author;
    this.ammountOfBooks++;
    this.ISBN = ISBN;
  }


  public void Title (String Title)
  {
    this.title = title;
  }

  public void yearOfPublishing (int YearOfPublishing)
  {
    this.YearOfPublishing = YearOfPublishing;
  }
      public void  Author(String author){
        this.author =author;
    }
    public void isbn (int ISBN)
  {
    this.ISBN = ISBN;
  }

    public void books (int ammountOfBooks)
  {
    this.ammountOfBooks = ammountOfBooks;
  }

 public static void main(String[] args){
     
     //book2
     
     String author = " Jeff Kinney";
     String publisher = " Amulet Books";
     String title = " Diary of a Wimpy Kid";
     int ammountOfBooks = 14;
     
     System.out.println("~~~~~~~~~~~~~~~~~~~~");
     System.out.println("book 2nd information");
     System.out.println("");
     System.out.println("the title is"+ title);
     System.out.println("The publisher is" + publisher);
     System.out.println("The author is"+ author);
     System.out.println("there are " + ammountOfBooks + " units");
     
     
     //book 3
     System.out.println("");
     System.out.println("~~~~~~~~~~~~~~~~~~~~");
     System.out.println("book 3rd information");
     System.out.println("");
     System.out.println("the title is");
     System.out.println("The publisher is");
     System.out.println("The author is");
     System.out.println("there are units");
    
     //book 4
     System.out.println("");
     System.out.println("~~~~~~~~~~~~~~~~~~~~");
     System.out.println("book 4th information");
     System.out.println("");
     System.out.println("the title is");
     System.out.println("The publisher is");
     System.out.println("The author is");
     System.out.println("there are units");
     
     System.out.println("");
 }
}
