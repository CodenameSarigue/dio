package OrdenaSet.exercicios1;

import com.sun.source.doctree.SeeTree;

import java.util.*;

public class exercicio1 {
    public static void main(String[] args) {
        System.out.println("Crie um conjunto com as cores do arco-íris");
        Set<String> coresArcoIris = new HashSet<>();
        coresArcoIris.add("violeta");
        coresArcoIris.add("azul");
        coresArcoIris.add("verde");
        coresArcoIris.add("vermelho");

        System.out.println(coresArcoIris);

        System.out.println("Exiba as cores uma abaixo da outra: ");
        for(String cor: coresArcoIris){
            System.out.println(cor);
        }
        System.out.println("A quantidade de cores: " +coresArcoIris.size());

        System.out.println("As cores na ordem alfabética");
        Set<String> coresArcoIris2 = new TreeSet<>(coresArcoIris);
        System.out.println(coresArcoIris2);

        System.out.println("Na ordem inversa em que foi informada");
        Set<String>coresArcoIris3 = new LinkedHashSet<>(Arrays.asList("violeta", "azul", "verde", "vermelho"));
        System.out.println(coresArcoIris3);
        List<String> coresArcoIrisList = new ArrayList<>(coresArcoIris3);
        Collections.reverse(coresArcoIrisList);
        System.out.println(coresArcoIrisList);

        System.out.println("Todas as cores que começam com V");
        for(String cor: coresArcoIris){
            if(cor.startsWith("v")) System.out.println(cor);
        }

        System.out.println("Remova todas as cores que não começam com a letra v");
        Iterator<String> iterator2 = coresArcoIris.iterator();
        while(iterator2.hasNext()){
            if(!iterator2.next().startsWith("v")) iterator2.remove();
        }
        System.out.println(coresArcoIris);

        System.out.println("Limpe o conjunto");
        coresArcoIris.clear();

        System.out.println("Está vazio? "+ coresArcoIris.isEmpty());
    }


}
