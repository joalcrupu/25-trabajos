package Vista;

public class Vista {

    public void mostrarMenu() {
        System.out.println("Elija una opcion:");
        System.out.println("1.Agregar numero:");
        System.out.println("2.calcular suma:");
        System.out.println("3.calcular multiplicacion:");
        System.out.println("4.calcular resta:");
        System.out.println("5.calcular division:");
        System.out.println("6.cambiar la posicion de numeros :");
        System.out.println("7.Mostrar lista de numeros:");
        System.out.println("8.salir");
    }
    public void mostrarResultado (String operacion,int resultado){
        System.out.println("el resultado de "+operacion +"es:"+resultado);
    }
}
