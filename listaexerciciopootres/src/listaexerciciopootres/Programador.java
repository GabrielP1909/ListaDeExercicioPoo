package listaexerciciopootres;

public class Programador extends Funcionario {

    private String linguagem;

    public Programador(String nome, double salario, String linguagem) {
        super(nome, salario, "Programador");
        this.linguagem = linguagem;
    }

    @Override
    public void trabalhar() {
        System.out.println(getNome() + " está programando em " + linguagem + ".");
    }

    @Override
    public double calcularBonus() {
        return getSalario() * 0.20;
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }
}