package com.pluralsight;

import java.util.Scanner;

public class Test {
    static Scanner scanner = new Scanner(System.in);
    public static Book [] Library;
    public static void main(String[] args) throws InterruptedException {
        Library = getLibrary();
        System.out.println("----------- Welcome to QPL Library ----------");
        while(true) {
        System.out.println("\nPlease Select form the followings");
        System.out.println(" To Show Available Books Enter [A] ");
        System.out.println(" To Show All Books Enter [B] ");
        System.out.println(" To Show Books That are Not Available Enter [C] ");
        System.out.println(" To Exit from Application Enter [X] ");;
        String command = Utilities.PromptForString("\nCommand [A, B, C, X]:  ");
                if (command.equalsIgnoreCase("A")) {
                    AvailableBooks(Library);
                    while (true){
                        System.out.println("\nPlease Select form the followings");
                        String checkOutOrExit = Utilities.PromptForString("To Check Out a Book Enter       [A] \nTo Exit Enter                   [B] ");

                        if (checkOutOrExit.equalsIgnoreCase("A")){
                        int idOfTheBookForCheckOut = Utilities.PromptForByte("Please Enter the ID number of your desired the book ");
                        String name = Utilities.PromptForString("What is Your name:  ");
                        Library[idOfTheBookForCheckOut-1].checkOut(name);
                        } else if ((checkOutOrExit.equalsIgnoreCase("B"))) {
                            break;
                        }
                        else {
                            System.out.println("\nPlease Select [A] or [B] Only");
                        }
                    }
                }
                if (command.equalsIgnoreCase("B"))  {
                    DisplayLibrary(Library);
                }
               else if (command.equalsIgnoreCase("C")) {
                    NotAvailableBooks(Library);
                }
                else if (command.equalsIgnoreCase("X")) {
                    break;
                } else {
                    System.out.println("\nPlease Select form [A], [B], [C], [X] Only");
                }
            }
    }
    public static void AvailableBooks (Book [] books){

        for (Book book: books){
            if (!book.isCheckedOut()){
            System.out.printf("%5s %55s %20s %24s\n" , book.getId(), book.getTitle(), book.getIsbn(), book.getCheckedOutTo());}
        }
    }
    public static void NotAvailableBooks (Book [] books){

        for (Book book: books){
            if (book.isCheckedOut()){
                System.out.printf("%5s %55s %20s %24s\n" , book.getId(), book.getTitle(), book.getIsbn(), book.getCheckedOutTo());}
        }
    }
    public static void PrintInitialPrompts(){
        System.out.println("----------- Welcome to QPL Library ----------");
        System.out.println("\nPlease Select form the followings");
        System.out.println(" To Show Available Books Enter [A] ");
        System.out.println(" To Show All Books Enter [B] ");
        System.out.println(" To Show CheckedOut Books Enter [C] ");
        System.out.println(" To Exit from Application Enter [E] ");
        String command = Utilities.PromptForString("\nCommand [A,B, C, X]:  ");
        char commandOut= ' ';

    }
    public static Book[] getLibrary() {

        Book[] library = new Book[9];

        library[0] = new Book(1, "Practical Tableau", "ISBN11332211");
        library[1] = new Book(2, "Pro Git", "ISBN1133229918");
        library[2] = new Book(3, "Genetic Programming", "ISBN2299220202");
        library[3] = new Book(4, "Clean Code", "ISBN9780136083238");
        library[4] = new Book(5, "Design Patterns", "ISBN9780201633610");
        library[5] = new Book(6, "Effective Java", "ISBN9780134686097");
        library[6] = new Book(7, "Java Concurrency in Practice", "ISBN9780321349606");
        library[7] = new Book(8, "The Pragmatic Programmer", "ISBN9780135957059");
        library[8] = new Book(9, "Introduction to the Theory of Computation", "ISBN9781133187790");

        return library;
    }
    public static void DisplayLibrary(Book [] books){
        for (Book book: books){
            System.out.printf("%5s %55s %20s %24s\n" , book.getId(), book.getTitle(), book.getIsbn(), book.getCheckedOutTo());
        }
    }
    public static void printSpecificBook(Book[] books, int index) {
        int currentIndex = 0;
        for (Book book : books) {
            if (currentIndex == index) {
                System.out.printf("%5s %55s %20s %24s\n", book.getId(), book.getTitle(), book.getIsbn(), book.getCheckedOutTo());
                return; // Exit the loop after printing the specific book
            }
            currentIndex++;
        }
        System.out.println("Invalid index.");

    }}



