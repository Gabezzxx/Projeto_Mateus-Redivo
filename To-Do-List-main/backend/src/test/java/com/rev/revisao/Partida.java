package com.rev.revisao;

public class Partida {
    private Lutador lutador1;
    private Lutador lutador2;
    private Lutador vencedor;

    public Partida(Lutador lutador1, Lutador lutador2) {
        this.lutador1 = lutador1;
        this.lutador2 = lutador2;
    }

    public void lutar(Lutador vencedor) {
        this.vencedor = vencedor;
        if (vencedor == lutador1) {
            lutador1.ganharLuta();
            lutador2.perderLuta();
        } else if (vencedor == lutador2) {
            lutador2.ganharLuta();
            lutador1.perderLuta();
        }
    }

    public void apresentarResultado() {
        System.out.println("Partida entre " + lutador1.getNome() + " e " + lutador2.getNome());
        System.out.println("Vencedor: " + vencedor.getNome());
    }
}