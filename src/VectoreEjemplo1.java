public class VectoreEjemplo1 {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        numeros[0] = 5;
        numeros[1] = 6;
        numeros[2] = 7;
        numeros[3] = 10;
        numeros[4] = 3;
        System.out.println(numeros[0]);
        System.out.println("Bucle");
        for (int i = 0; i < 5; i++) {
            System.out.println(numeros[i]);
        }


            //**definir un array de string de 7 posiciones
            //**y asignarles valor

            String[] letras = new String[7];
            letras[0] = "carmen";
            letras[1] = "Paco";
            letras[2] = "Francisco";
            letras[3] = "Pedro";
            letras[4] = "Pablo";
            letras[5] = "Ester";
            letras[6] = "Pamela";
//Starwith  endwith comienza o termina
            //Realizar un bucle para contar los nombres que comienzan con P
            int contador = 0;
            for (int i=0; i<letras.length; i++) {
                System.out.println(letras[i].startsWith("P"));
                if (letras[i].startsWith("P") == true){

                    contador++;


          }  }
            System.out.println("hay" + contador + "nombres que comienzan con P");

}
}