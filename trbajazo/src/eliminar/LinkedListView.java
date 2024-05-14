package eliminar;

import java.util.HashSet;
import nodo.Nodo;

public class LinkedListView {

    public void removeDuplicates(Nodo head) {
        HashSet<Integer> set = new HashSet<>();
        Nodo current = head;
        Nodo prev = null;

        while (current != null) {
            int data = current.data;

            if (set.contains(data)) {
                // Elimina el nodo duplicado
                prev.next = current.next;
            } else {
                set.add(data);
                prev = current;
            }

            current = current.next;
        }
    }

    public void printList(Nodo head) {
        Nodo temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
