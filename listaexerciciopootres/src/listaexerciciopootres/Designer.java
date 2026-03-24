package listaexerciciopootres;

public class Designer extends Funcionario {

    private String ferramenta;

    public Designer(String nome, double salario, String ferramenta) {
        super(nome, salario, "Designer");
        this.ferramenta = ferramenta;
    }

    @Override
    public void trabalhar() {
        System.out.println(getNome() + " está criando designs no " + ferramenta + ".");
    }

    @Override
    public double calcularBonus() {
        return getSalario() * 0.18;
    }

    public String getFerramenta() {
        return ferramenta;
    }

    public void setFerramenta(String ferramenta) {
        this.ferramenta = ferramenta;
    }
}