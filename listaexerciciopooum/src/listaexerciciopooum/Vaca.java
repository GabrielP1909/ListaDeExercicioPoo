package listaexerciciopooum;

public class Vaca extends Animal {

    private double producaoLeite;

    public Vaca(String nome, int idade, double peso, double producaoLeite) {
        super(nome, idade, peso);
        this.producaoLeite = producaoLeite;
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " diz: Muu!");
    }

    public double getProducaoLeite() {
        return producaoLeite;
    }

    public void setProducaoLeite(double producaoLeite) {
        this.producaoLeite = producaoLeite;
    }
}