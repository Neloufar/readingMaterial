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
public class Main {
    
  public static void main(String []args){

ReadingMaterial magazines = new Magazines("Nancy Gibbs","TIME",50,0);
ReadingMaterial textbook = new Textbook("Zill & Wright", "Differential Equations with Boundry Value Problems",549,0);
ReadingMaterial tj = new technicalJournal("Chris Hendy", "Atkins Group",107,0);
ReadingMaterial novel = new Novel("Homer", "The Odyssey",270,23);
ReadingMaterial book = new Book("J.K. Rowling","rry Potter and the Sorcerer's Stone",309,10);
System.out.print(magazines.toString());
System.out.print(textbook.toString());
System.out.print(tj.toString());
System.out.print(novel.toString());
System.out.print(book.toString());

}
}  
