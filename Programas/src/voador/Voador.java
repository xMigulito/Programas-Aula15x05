package voador;

import animal.Animal;

public class Voador extends Animal{
    private int numAsas;

    public int getNumAsas() {
        return numAsas;
    }

    public void setNumAsas(int numAsas) {
        this.numAsas = numAsas;
    }

    public Voador(int numAsas, String nome, String origem) {
        this.setNumAsas(numAsas);
        this.setNome(nome);
        this.setOrigem(origem);
    }

    @Override
    public String toString() {
        return "Voador [Asas=" + this.getNumAsas() + " Nome=" + this.getNome() +  " Origem=" + this.getOrigem() + "]";
    }

    
}
