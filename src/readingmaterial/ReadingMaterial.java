/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package readingmaterial;

/**
 *
 * @author neliloghmani
 */
public class ReadingMaterial {

    /**
     * @param args the command line arguments
     */
    
    int numberOfPages;
    String author;
    String book;
    int numberOfPCharecters;
    
  public ReadingMaterial(String authorName, String bookName, int page, int charecters)
  {
      this.numberOfPages = page;
      this.author = authorName;
      this.book = bookName;          
      this.numberOfPCharecters = charecters;
      
  }
  
  public void setNumberOfPages (int pages)
  {
   numberOfPages = pages;
  }
  public int getNumberOfPages()
  {
      return numberOfPages;
  }
  public void setWriter( String nameOfAuthor)
  {
      author = nameOfAuthor;
  }
  public String getWriter()
  {
      return author;
  }
  public void setBook (String nameOfBook)
  {
      book = nameOfBook;
  }
  public String getBook()
  {
      return book;
  }
  public void setCharecters(int cNumber)
  {
      numberOfPCharecters = cNumber;
  }
  public int getCharecters()
  {
      return numberOfPCharecters;
  }
  public String toString()
  {
     return "Name :" + book + "Author" + author + 
            "Number Of Pages : " + numberOfPages + "Number Of Primary Charecters"
             + numberOfPCharecters;
  }
}
