package com.pluralsight;

public class Main {
    public static Book [] Library;
    public static void main(String[] args) {

    //Library = getLibrary();
    //DisplayLibrary(Library);


    }


    public static Book[] GetAvailableBooks(Book[] books){
        Book[] available = new Book[books.length];
        int nextIndex = 0;
        for(Book book : books){
            if(!book.isCheckedOut()){
                available[nextIndex++] = book;
            }
        }
        Book[] results = new Book[nextIndex];
        System.arraycopy(available,0,results,0,nextIndex);

        return results;


    }

    public static Book[] GetCheckOutBooks(Book[] books){
        Book[] checkedout = new Book[books.length];
        int nextIndex = 0;
        for(Book book : books){
            if(book.isCheckedOut()){
                checkedout[nextIndex++] = book;
            }
        }
        Book[] results = new Book[nextIndex];
        System.arraycopy(checkedout,0,results,0,nextIndex);

        return results;


    }


    public static char PromptMainChoices(){

            System.out.println("----------- Welcome to QPL Library ----------");
            System.out.println("\nPlease Select form the followings");
            System.out.println(" To Show Available Books Enter [A] ");
            // System.out.println(" To Show All Books Enter [B] ");
            System.out.println(" To Show CheckedOut Books Enter [C] ");
            System.out.println(" To Exit from Application Enter [E] ");
            do {
            String command = Utilities.PromptForString("\nCommand [A, C, X]:  ");
            if (command.equalsIgnoreCase("A")) {
                return 'A';
            }
            if (command.equalsIgnoreCase("C")) {
                return 'C';
            }
            if (command.equalsIgnoreCase("X")) {
                return 'X';
            }
        } while (true);
    }

    public static Book[] getLibrary() {

        Book[] library = new Book[20];

        library[0] = new Book(1, "Practical Tableau", "ISBN11332211");    library[1] = new Book(2, "Pro Git", "ISBN1133229918");
        library[2] = new Book(3, "Genetic Programming", "ISBN2299220202");    library[3] = new Book(4, "Clean Code", "ISBN9780136083238");
        library[4] = new Book(5, "Design Patterns", "ISBN9780201633610");    library[5] = new Book(6, "Effective Java", "ISBN9780134686097");
        library[6] = new Book(7, "Java Concurrency in Practice", "ISBN9780321349606");    library[7] = new Book(8, "The Pragmatic Programmer", "ISBN9780135957059");
        library[8] = new Book(9, "Introduction to the Theory of Computation", "ISBN9781133187790");    library[9] = new Book(10, "Artificial Intelligence: A Modern Approach", "ISBN9780134610993");
        library[10] = new Book(11, "The Art of Computer Programming", "ISBN9780201896831");    library[11] = new Book(12, "Python Crash Course", "ISBN9781593279288");
        library[12] = new Book(13, "The Clean Coder", "ISBN9780136083238");
        library[13] = new Book(14, "Code Complete", "ISBN9780735619678");
        library[14] = new Book(15, "Refactoring: Improving the Design of Existing Code", "ISBN9780134757599");
        library[15] = new Book(16, "Head First Design Patterns", "ISBN9780596007126");
        library[16] = new Book(17, "You Don't Know JS", "ISBN9781491950357");
        library[17] = new Book(18, "The Mythical Man-Month", "ISBN9780201835953");
        library[18] = new Book(19, "Learning JavaScript Data Structures and Algorithms", "ISBN9781785880332");
        library[19] = new Book(20, "The Elements of Programming Interviews", "ISBN9781512218237");

        return library;
    }

    public static void DisplayLibrary(Book [] books){
        for (Book book: books){
            System.out.printf("%5s %55s %20s %24s\n" , book.getId(), book.getTitle(), book.getIsbn(), book.getCheckedOutTo());
        }
    }


}