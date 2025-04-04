import java.util.Arrays;

public class ArrayOrdenado {

    public static void main(String[] args) {
        int[] numeros = {1, 2, 2, 2, 2, 3, 5, 5, 9, 15};
        int[] novoArray = new int[10];
        int cont = 0;
        int posicao = 0;
        for (int i = 0; i < numeros.length; i++) {
            cont++;
            if (cont == numeros.length) {
                if (numeros[i] != numeros[i - 1]) {
                    novoArray[posicao] = numeros[i];
                }
                break;
            }
         //   if(cont < numeros.length) {
                if (numeros[i] != numeros[cont]) {
                    novoArray[posicao] = numeros[i];
                    posicao++;
                }
        //    }

        }
        Arrays.stream(novoArray).forEach(System.out::println);
    }

}


