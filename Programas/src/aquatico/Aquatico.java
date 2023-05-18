package aquatico;

import animal.Animal;

public class Aquatico extends Animal{
    private int numNada;

    public int getNumNada() {
        return numNada;
    }

    public void setNumNada(int numNada) {
        this.numNada = numNada;
    }

    public Aquatico(int numNada, String nome, String origem) {
        this.setNumNada(numNada);
        this.setNome(nome);
        this.setOrigem(origem);
    }

    @Override
    public String toString() {
        return "Aquatico [Nadadeiras=" + this.getNumNada()+ " Nome=" + this.getNome() +  " Origem=" + this.getOrigem() + "]";
    }

    
}
