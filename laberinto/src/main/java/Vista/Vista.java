package Vista;

import java.util.Scanner;

public class Vista {

    private int opciones[] = new int[4];

    public void displayMessage(String message) {
        System.out.println(message);
    }

    public int[] nivel1() {
        displayMessage("Welcome to level one:");
        displayMessage("Welcome wandering adventurer, if you want to cross these doors you must answer the following questions");
        displayMessage("What is the difference between == and === in JavaScript?");
        Scanner leer = new Scanner(System.in);
        displayMessage("1) I don't know\n"
                + "2) The first is to show the result of an operation and the second is to compare\n"
                + "3) Compares the value of two variables, while === compares both the value and the type of the variables");

        opciones[0] = leer.nextInt();

        return opciones;
    }

    public int[] nivel2() {
        Scanner leer = new Scanner(System.in);
        displayMessage("Welcome to level two:");
        displayMessage("¿What does it mean CSS?\n"
                + "1) Counter Strike: Source\n"
                + "2) Computer Style Sheets\n"
                + "3) Creative Style System\n"
                + "4) Cascading Style Sheets:");
        opciones[1] = leer.nextInt();

        return opciones;
    }

    public int[] nivel3() {
        Scanner leer = new Scanner(System.in);
        displayMessage("Welcome to level three:");
        displayMessage("What is a loop in programming?\n"
                + "1) Un tipo de dato (a) A data type\n"
                + "2) Una estructura de control de flujo (b) A flow control structure\n"
                + "3) Una variable global (c) A global variable\n"
                + "4) Un dispositivo de entrada (d) An input device");
        opciones[2] = leer.nextInt();

        return opciones;
    }

    public int[] nivel4() {
        Scanner leer = new Scanner(System.in);
        displayMessage("Welcome to level four:");
        displayMessage(" What does the acronym \"API\" stand for in the context of software development?\n"
                + "a) Application Programming Interface\n"
                + "b) Advanced Programming Interface\n"
                + "c) Automated Programming Interface\n"
                + "d) Application Process Interface");
        opciones[3] = leer.nextInt();

        return opciones;
    }

    public int[] sifalla() {
        displayMessage("answer incorrect");
        return opciones;
    }

    public int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
      public int[] sipierde () {
        displayMessage("you lose");
        return opciones;
    }
}
