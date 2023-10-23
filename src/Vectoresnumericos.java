public class Vectoresnumericos {
    public static void main(String[] args) {

        //**Declarar un array de 5 numeros
        //** poner los valores desde codigo
        //** obtner el numero mas pequeño

        int [] numeros = new int[5];
        numeros[0] = 5;
        numeros[1] = 6;
        numeros[2] = 7;
        numeros[3] = 10;
        numeros[4] = 1;
        int numeroMaspequeno = numeros[0];
        for(int i =0; i <numeros.length;i++){
        if (numeros[i]<numeroMaspequeno){
            numeroMaspequeno = numeros[i];

        System.out.println("el numero mas pequeño es->"+ numeroMaspequeno);
    }
}
    }

}