package listaexerciciopootres;

public class Gerente extends Funcionario {

    private int equipe;

    public Gerente(String nome, double salario, int equipe) {
        super(nome, salario, "Gerente");
        this.equipe = equipe;
    }

    @Override
    public void trabalhar() {
        System.out.println(getNome() + " está gerenciando a equipe.");
    }

    @Override
    public double calcularBonus() {
        return getSalario() * 0.30;
    }

    public int getEquipe() {
        return equipe;
    }

    public void setEquipe(int equipe) {
        this.equipe = equipe;
    }
}