package DIO.AulaCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenaCachorro {
    public static void main(String[] args) {

        List<Cachorro> meusCachorros = new ArrayList<>(){{
            add(new Cachorro("Jon", 18, "preto"));
            add(new Cachorro("Simba", 6, "tigrado"));
            add(new Cachorro("Jon", 12, "preto"));

        }};
        System.out.println("Ordem de inserção:");
        System.out.println(meusCachorros);
        System.out.println("Ordem aleatória");
        Collections.shuffle(meusCachorros);
        System.out.println(meusCachorros);
        System.out.println("Ordem natural");
        Collections.sort(meusCachorros);
        System.out.println(meusCachorros);

        System.out.println("Ordem de idade");
        Collections.sort(meusCachorros, new ComparatorIdade());
        System.out.println(meusCachorros);

        System.out.println("Ordem de cor");
        meusCachorros.sort(new ComparatorCor());
        System.out.println(meusCachorros);

        System.out.println("Ordem de Nome, Cor e Idade");
        meusCachorros.sort(new ComparatorNomeCorIdade());
        System.out.println(meusCachorros);



    }
}

class Cachorro implements Comparable<Cachorro> {
    private String nome;
    private Integer idade;
    private String cor;

    //insert Constructor de nome, idade e cor
    public Cachorro(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }
    //insert Getter

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }
    //insert toString

    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Cachorro cachorro) {
        return this.getNome().compareToIgnoreCase(cachorro.getNome());

    }
}

class ComparatorIdade implements Comparator<Cachorro>{

    @Override
    public int compare(Cachorro c1, Cachorro c2) {
        return Integer.compare(c1.getIdade(), c2.getIdade());
    }
}

class ComparatorCor implements Comparator<Cachorro> {
    @Override
    public int compare(Cachorro c1, Cachorro c2) {
        return c1.getCor().compareToIgnoreCase(c2.getCor());
    }
}

class ComparatorNomeCorIdade implements Comparator<Cachorro>{
    @Override
    public int compare(Cachorro c1, Cachorro c2) {
        int nome = c1.getNome().compareToIgnoreCase(c2.getNome());
        if(nome != 0) return nome;

        int cor = c1.getCor().compareToIgnoreCase(c2.getCor());
        if(cor != 0) return cor;





        return 0;
    }
}