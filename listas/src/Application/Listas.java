package Application;

import java.util.ArrayList;
import java.util.List;

public class Listas {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(); // cria uma lista com as vantagens do vetor e da lista
        list.add("Maria"); // adiciona dinamicamente dentro deste "vetor"
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marco"); // adiciona no index 2
        System.out.println(list.size()); // mostra o tamanho da lista
        for (String x : list) { //
            System.out.println(x); // usando forEach mostra toda a lista
        }
        System.out.println("---------------------");
        list.removeIf(x -> x.charAt(0) == 'M'); // remove somente nomes com a inicial "M"
        for (String x : list) {
            System.out.println(x); // imprime a lista
        }
        System.out.println("---------------------");
        System.out.println("Index of Bob: " + list.indexOf("Bob")); // procura o nome e mostra o index que ele esta
        System.out.println("Index of Marco: " + list.indexOf("Marco"));
        System.out.println("---------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').toList(); // cria uma lista e adiciona somente nomes que iniciam com "A"
        for (String x : result) {
            System.out.println(x); // imprime a lista "result"
        }
        System.out.println("---------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(name);  // procura o primeiro nome que tem a inicial "J", caso não tenha na lista, retorna "null"

    }

}
