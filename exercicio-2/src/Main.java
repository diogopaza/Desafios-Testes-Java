import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Iniciando!!!");
        int[] numeros = {
                4, 4, 4, 4,   // 4 números 4
                8, 8, 8,      // 3 números 8
                15, 15, 15, 15, 15,  // 5 números 15
                22, 22, 22, 22,  // 4 números 22
                30, 30, 30, 30, 30, 30, // 6 números 30
                45, 45, 45, 45, 45,  // 5 números 45
                50, 50, 50, 50, 50, 50, 50, // 7 números 50
                60, 60, 60, 60, 60, 60, // 6 números 60
                11, 23, 33, 47, 52, 63, 71, 82, 91, 105,
                112, 123, 135, 140, 150, 161, 172, 180, 190, 200,
                9, 18, 27, 36, 44, 53, 67, 78, 88, 98,
                108, 118, 128, 138, 148, 158, 168, 178, 188, 198,
                13, 29, 39, 49, 59, 69, 79, 89, 99, 109,
                119, 129, 139, 149, 159, 169, 179, 189, 199, 209
        };

      //  int[] numeros = {2, 5, 8};
        int[] novoArray = new int[100];
        boolean igual;
        int cont = 0;
        int posicao = 0;
        for (int i = 0; i < numeros.length; i++) {
            igual = false;
            cont = 0;
            while (igual == false) {
                if (i != cont) {
                    if (numeros[i] == numeros[cont]) {
                        igual = true;

//                        novoArray[posicao] = numeros[i];
//                        posicao++;

                        break;
                    }
                }
                cont++;
                if (cont >= numeros.length && igual == false) {
                    novoArray[posicao] = numeros[i];
                    posicao++;
                    break;
                }
            }

        }
        Arrays.stream(numeros).sorted().forEach(System.out::println);
        System.out.println("NOVO ARRAY \n");
        Arrays.stream(novoArray).forEach(System.out::println);

    }
}