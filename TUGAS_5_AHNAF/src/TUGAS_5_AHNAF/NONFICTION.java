/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUGAS_5_AHNAF;

/**
 *
 * @author Ahnaf
 */
public class NONFICTION extends BOOK{
    private String BookType;

    public NONFICTION() {
        super();
        BookType = "Non-Fiksi";
    }

    public NONFICTION(String BookType, String Title, String Author, String Type, int Pages) {
        super(Title, Author, Type, Pages);
        this.BookType = BookType;
    }

    public String getJenisBuku() {
        return BookType;
    }

    public void setJenisBuku(String BookType) {
        this.BookType = BookType;
    }
    
}