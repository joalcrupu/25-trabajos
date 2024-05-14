package modelo;

public class ListaCircular {
    private Nodo head;
    private int size;

    public ListaCircular(int numSillas, String[] nombresJugadores) {
        this.head = null;
        this.size = 0;
        // Lógica para inicializar la lista circular con el número de sillas y los nombres de los jugadores
        for (String nombre : nombresJugadores) {
            add(nombre); // Agregar cada jugador a la lista circular
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(String jugador) {
        Nodo newNode = new Nodo(jugador);
        if (isEmpty()) {
            head = newNode;
            head.next = head; // La lista apunta a sí misma formando un ciclo
        } else {
            Nodo temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
        size++;
    }

    public void remove(String jugador) {
        if (isEmpty()) {
            return;
        }

        Nodo current = head;
        Nodo prev = null;

        // Buscar el nodo a eliminar
        do {
            if (current.jugador.equals(jugador)) {
                break;
            }
            prev = current;
            current = current.next;
        } while (current != head);

        // Si el nodo no se encontró
        if (current == head && !current.jugador.equals(jugador)) {
            return;
        }

        // Si el nodo a eliminar es el único nodo en la lista
        if (current == head && current.next == head) {
            head = null;
        } else if (current == head) { // Si el nodo a eliminar es la cabeza
            prev = head;
            while (prev.next != head) {
                prev = prev.next;
            }
            head = head.next;
            prev.next = head;
        } else { // Si el nodo a eliminar está en medio de la lista
            prev.next = current.next;
        }

        size--;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("La lista circular está vacía.");
            return;
        }

        Nodo current = head;
        do {
            System.out.print(current.jugador + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }

    public void move(int pasos) {
        // Mover la posición actual (cabeza) la cantidad de pasos especificada
        for (int i = 0; i < pasos; i++) {
            head = head.next;
        }
    }

    public void removeCurrent() {
        if (isEmpty()) {
            return;
        }
        // Eliminar al jugador actual (cabeza)
        head = head.next;
        size--;
    }

    public String getCurrentPlayer() {
        return head.jugador; // Obtener el nombre del jugador actual (cabeza)
    }

    private static class Nodo {
        String jugador;
        Nodo next;

        public Nodo(String jugador) {
            this.jugador = jugador;
            this.next = null;
        }
    }
}
