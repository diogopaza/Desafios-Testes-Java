import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //lista fixa, mas mutavel, pode alterar os elementos, nao pode adicionar ou remover elementos.
        List<String> colors = Arrays.asList("red","black","orange","blue","yellow");
        System.out.println(colors);

        //lista imutavel, nao pode alterar, remover ou adicionar elementos.
        List<String> colors2 = List.of("marrom","branco","preto");
        System.out.println(colors2);

        //lista mutavel, pode adicionar, remover ou alterar os elementos.
        List<String> colors3 = new ArrayList<String>();
        colors3.add("roxo");
        colors3.add("rosa");
        colors3.add("ciano");
        System.out.println(colors3);

        var result = colors.stream()
                .filter(cor -> cor.length() < 6 )
                .sorted(Comparator.comparing(String::length).reversed())
                .map(cor -> new StringBuilder(cor).reverse().toString())
                .collect(Collectors.joining(","));

        System.out.println(result);


    }
}
