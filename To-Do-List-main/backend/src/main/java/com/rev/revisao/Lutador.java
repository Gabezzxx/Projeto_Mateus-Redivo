package com.rev.revisao;

public class Lutador {
    private String nome;
    private String categoria;
    private int vitorias;
    private int derrotas;

    public Lutador(String nome, String categoria, int vitorias, int derrotas) {
        this.nome = nome;
        this.categoria = categoria;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
    }

    public void apresentar() {
        System.out.println("Lutador: " + nome);
        System.out.println("Categoria: " + categoria);
        System.out.println("Vitórias: " + vitorias);
        System.out.println("Derrotas: " + derrotas);
    }

    public void ganharLuta() {
        vitorias++;
    }

    public void perderLuta() {
        derrotas++;
    }


    public String getNome() { return nome; }
    public String getCategoria() { return categoria; }
    public int getVitorias() { return vitorias; }
    public int getDerrotas() { return derrotas; }


    public static void apresentarLutadoresFamosos() {
        Lutador l1 = new Lutador("Anderson Silva", "Peso Médio", 34, 11);
        Lutador l2 = new Lutador("Jon Jones", "Peso Meio-Pesado", 27, 1);
        Lutador l3 = new Lutador("Amanda Nunes", "Peso Galo Feminino", 23, 5);
        Lutador l4 = new Lutador("José Aldo", "Peso Pena", 31, 8);
        Lutador l5 = new Lutador("Conor McGregor", "Peso Leve", 22, 6);

        l1.apresentar();
        l2.apresentar();
        l3.apresentar();
        l4.apresentar();
        l5.apresentar();
    }
}