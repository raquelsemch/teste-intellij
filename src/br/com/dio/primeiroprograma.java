package br.com.dio;

import br.com.dio.model.Gato;

public class primeiroprograma {
    public static void main(String[] args) {
        Gato gato = new Gato();

        System.out.println(gato);

        livro Livro1 = new livro("Sagarana", 450);

        System.out.println(Livro1);

        /*int a = 2;
        int b = 3;

        System.out.println("Hello World! " + (a+b));*/
    }
}

class livro {
    private String nome;
    private Integer numPaginas;

    public livro(String nome, Integer numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}