package listaexerciciopooum;

public class Cavalo extends Animal {

    private String tipo;

    public Cavalo(String nome, int idade, double peso, String tipo) {
        super(nome, idade, peso);
        this.tipo = tipo;
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " diz: Relincho!");
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}