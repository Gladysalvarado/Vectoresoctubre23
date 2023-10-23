import java.util.Scanner;

public class VectoresEjemplo2 {
    public static void main(String[] args) {
        //**Declarar un array de 5 posiciones de tipo char y hay que leerlo por la consola
        // scanner - usando el metodo next() del scanner y el metodo chartart() del string
//definicion de variables paso 1
        Scanner entradaTeclado= new Scanner(System.in);
        System.out.println("introduce el nombre de un datos");
        char [] datos = new char[5];

        for (int i=0; i<datos.length; i++) {
            System.out.println("escriba la letra->");
            datos[i] = entradaTeclado.next().charAt(0);

            //dos lineas
            //String datos = entradaTeclado.next();
            //dato[i] =palabra.charat(0);



    }System.out.println(datos);
}
}