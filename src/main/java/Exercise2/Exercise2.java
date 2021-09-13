package Exercise2;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner Name =  new Scanner(System.in);

        System.out.print("What is your Name? ");

        String name = Name.nextLine();

        int charactercount = name.length();

        System.out.printf("\n%s has %d characters", name, charactercount);
    }
}
