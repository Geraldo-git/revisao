package lista;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListaBasica {

    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();

        lista.add("Maria ");
        lista.add("Mario ");
        lista.add("Joao ");
        lista.add("Joana ");

        lista.forEach(System.out::println);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        lista.add(2,"Marina ");
        lista.forEach(System.out::println);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        lista.remove(2);
        lista.forEach(System.out::println);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        lista.removeIf(x -> x.charAt(0)=='M');
        lista.forEach(System.out::println);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        lista.add(2,"Marina ");
        lista.forEach(System.out::println);
        System.out.println(lista.indexOf("Joana "));
        System.out.println(lista.indexOf("Maria "));
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        lista.add("Nair");
        lista.add("Naiara");
        lista.forEach(System.out::println);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        List<String> filtro = lista.stream().filter(x -> x.charAt(0) == 'N').toList();
        filtro.forEach(System.out::println);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        String nome = lista.stream().filter(x -> x.charAt(0)=='J').findFirst().orElse(null);
        System.out.println(nome);







    }
}
