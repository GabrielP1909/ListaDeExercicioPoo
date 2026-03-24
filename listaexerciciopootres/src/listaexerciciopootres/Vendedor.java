package listaexerciciopootres;

public class Vendedor extends Funcionario {

    private double vendas;

    public Vendedor(String nome, double salario, double vendas) {
        super(nome, salario, "Vendedor");
        this.vendas = vendas;
    }

    @Override
    public void trabalhar() {
        System.out.println(getNome() + " está vendendo produtos.");
    }

    @Override
    public double calcularBonus() {
        return getSalario() * 0.15 + (vendas * 0.05);
    }

    public double getVendas() {
        return vendas;
    }

    public void setVendas(double vendas) {
        this.vendas = vendas;
    }
}