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
public class BOOK extends PERPUSTAKAAN {

    private String Title;
    private String Author;
    private String Type;
    private int Pages;

    public BOOK() {
        Title = "null";
        Author = "null";
        Pages = 0;
        Type = "null";
    }

    public BOOK(String Title, String Author, String Type, int Pages) {
        this.Title = Title;
        this.Author = Author;
        this.Pages = Pages;
        this.Type = Type;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public int getPages() {
        return Pages;
    }

    public void setPages(int Pages) {
        this.Pages = Pages;
    }
}
