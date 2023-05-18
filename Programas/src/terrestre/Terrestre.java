package terrestre;

import animal.Animal;

public class Terrestre extends Animal {
    private int numPatas;

    public int getNumPatas() {
        return numPatas;
    }

    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }

    public Terrestre(int numPatas, String nome, String origem) {
        this.setNumPatas(numPatas);
        this.setNome(nome);
        this.setOrigem(origem);
    }

    @Override
    public String toString() {
        return "Terrestre [Patas=" + this.getNumPatas() + " Nome=" + this.getNome() +  " Origem=" + this.getOrigem() + "]";
    }
    
    
}
