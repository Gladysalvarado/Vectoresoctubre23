import java.util.Scanner;

public class Vectoresnumericos2 {
    public static void main(String[] args) {

        //**Declarar un array de 5 numeros
        //** poner los valores desde codigo
        //** obtner el numero mas pequeño
        Scanner entradaTeclado = new Scanner(System.in);
        int [] numeros = new int[5];
        numeros[0] = entradaTeclado.nextInt();
        numeros[1] = entradaTeclado.nextInt();
        numeros[2] = entradaTeclado.nextInt();
        numeros[3] = entradaTeclado.nextInt();
        numeros[4] = entradaTeclado.nextInt();
        int numeroMasmayor = numeros[0];
        for(int i =0; i <numeros.length;i++){
        if (numeros[i]>numeroMasmayor){
            numeroMasmayor = numeros[i];


    }
}System.out.println("el numero mas mayor es->"+ numeroMasmayor);
    }

}