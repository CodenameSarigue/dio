package DIO.AulaCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListMethods {
    public static void main(String[] args) {
        System.out.println("Crie uma lista e adicione 7 notas.");
        List<Double> notas = new ArrayList<Double>();
        notas.add(7d);
        notas.add(8.5d);
        notas.add(9.3);
        notas.add(5d);
        notas.add(7d);
        notas.add(0d);
        notas.add(3.6d);
        System.out.println(notas);

        System.out.println("Exiba a posição da nota 5.0: " +notas.indexOf(5d));
        System.out.println("Adicione na lsita a nota 8.0 na posição 4: ");
        notas.add(4, 8d);
        System.out.println(notas);

        notas.set(notas.indexOf(5d), 6d);
        System.out.println(notas);

        System.out.println(notas.contains(5d));

        System.out.println(notas.get(2));
        System.out.println(Collections.min(notas));
        System.out.println(Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);

        System.out.println((soma/notas.size()));

        notas.remove(0d);
        System.out.println(notas);

        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
            System.out.println(notas);

            notas.clear();
            System.out.println(notas);

            System.out.println(notas.isEmpty());
        }








    }

}
