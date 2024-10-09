package com.pluralsight;

public class Book {
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;


    public Book(int id, String title, String isbn){
        this.id = id;
        this.title=title;
        this.isbn=isbn;

        this.checkedOutTo="";
        this.isCheckedOut=false;
    }

    //Getters

    public int getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public void checkOut(String name){
        this.checkedOutTo=name;
        this.isCheckedOut=true;
    }

    public void checkIn(){
        this.checkedOutTo="";
        this.isCheckedOut=false;
    }


    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", isCheckedOut=" + isCheckedOut +
                ", checkedOutTo='" + checkedOutTo + '\'' +
                '}';
    }
}
