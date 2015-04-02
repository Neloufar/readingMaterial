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
public class technicalJournal extends ReadingMaterial{
   
    public technicalJournal(String authorName, String bookName, int page, int charecters)
    {
        super(authorName, bookName, page, charecters);
    }
    public String toString(){
 
      return "Technical journal Name: " + book + "\nTechnical journal Author: " + author + 
            "\nNumber Of Pages: " + numberOfPages + "\nNumber Of Primary Charecters: "
             + numberOfPCharecters + "\n----------------------\n";
    }
}
