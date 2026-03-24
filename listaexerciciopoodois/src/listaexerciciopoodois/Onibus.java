package listaexerciciopoodois;

public class Onibus extends Veiculo {

    private int capacidade;

    public Onibus(String marca, String modelo, int ano, int capacidade) {
        super(marca, modelo, ano);
        this.capacidade = capacidade;
    }

    @Override
    public void mover() {
        System.out.println(getModelo() + " está transportando passageiros.");
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
}