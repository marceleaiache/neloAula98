package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        //DECLARAÇÃO DE UMA LISTA DE TIPO STRING E INSTANCIAÇÃO DA LISTA
        List<String> list = new ArrayList<>();

        //ADICIONADO ELEMENTOS A LISTA
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");

        //PERCORRENDO A LISTA INTEIRA E IMPRIMINDO OS ELEMENTOS
        for (String x : list) {
            System.out.println(x);
        }

        //IMPRIMINDO O TAMANHO DA LISTA == QUANTIDADE DE ELEMENTOS
        System.out.println(list.size());

        System.out.println("---------------------------");

        list.add(2, "Marco");

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println(list.size());
        System.out.println("---------------------------");

        //REMOVENDO ITENS DA LISTA
        list.remove("Anna");

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println(list.size());
        System.out.println("---------------------------");

        //REMOVENDO ITEM DA LISTA COM A PRIMEIRA LETRA DE ACORDO COM O QUE EU ESPECIFIQUEI
        list.removeIf(x -> x.charAt(0) == 'M');

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println(list.size());
        System.out.println("---------------------------");

        //IMPRIMINDO NA TELA O INDEX QUE O ELEMENTO PERTENCE
        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("Index of Bob: " + list.indexOf("Marco"));
        System.out.println("---------------------------");

        /*
         FILTRAR A LISTA CRIANDO UMA NOVA LISTA COM O FILTRO QUE FOI REALIZADO
         *   List<String> result =    declaração da nova lista
         *   list.stream() expressão lambda =
         *   filter(x -> x.charAt(0) == 'A') -> filtra na lista x elementos que tenham na primeira letra 'A'
         *   .collect(Collectors.toList())    coleta o que foi filtrado e insere na lista declarada
         */
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

        for (String x : result) {
            System.out.println(x);
        }

        System.out.println("---------------------------");

        //DECLARANDO UMA VARIÁVEL COM O VALOR DE UM ITEM DA LISTA QUE CONTENHA O FILTRO DESEJADO, CASO NAO, PREENCHA
        // COM NULL
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);
        System.out.println("---------------------------");

        String otherName = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(otherName);
        System.out.println("---------------------------");
    }
}
