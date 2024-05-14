package main;

import java.util.Scanner;
import eliminar.LinkedListView;
import nodo.Nodo;

public class Trbajazo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Nodo head = null;
        Nodo tail = null;

        System.out.println("Ingrese el nombre del tren:");

        // Se ingresa el nombre del tren una vez
        String nombreTren = scanner.next();

        System.out.println("Ingrese elementos de la lista (para finalizar ingrese -1):");

        int input;
        while ((input = scanner.nextInt()) != -1) {
            Nodo newNode = new Nodo(input);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        // Crear instancia de la vista
        LinkedListView listView = new LinkedListView();

        System.out.println("Lista original del tren " + nombreTren + ":");
        listView.printList(head);

        // Eliminar duplicados
        listView.removeDuplicates(head);

        System.out.println("Lista después de eliminar duplicados del tren " + nombreTren + ":");
        listView.printList(head);
    }
}
