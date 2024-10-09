package com.pluralsight;
import java.util.Scanner;

public class Utilities {


    static Scanner scanner = new Scanner(System.in);

    public static String PromptForString(String prompt) {
        System.out.print(prompt);
        String userInput = scanner.nextLine();
        return userInput;
    }
    public static short PromptForShort(String prompt) {
        System.out.print(prompt);
        short userinput = scanner.nextShort();
        scanner.nextLine();
        return userinput;
    }

    public static byte PromptForByte(String prompt) {
        System.out.print(prompt);
        byte userinput = scanner.nextByte();
        scanner.nextLine();
        return userinput;
    }

    public static String PromptForString() {
        return scanner.nextLine();
    }

    public static boolean PromptForYesNo(String prompt) {
        System.out.print(prompt + " ( Y for Yes, N for No ) ?");
        String userinput = scanner.nextLine();

        return
                (
                        userinput.equalsIgnoreCase("Y")
                                ||
                                userinput.equalsIgnoreCase("YES")
                );

    }

}