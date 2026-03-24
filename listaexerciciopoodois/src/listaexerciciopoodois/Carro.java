package listaexerciciopoodois;

public class Carro extends Veiculo {

    private int portas;

    public Carro(String marca, String modelo, int ano, int portas) {
        super(marca, modelo, ano);
        this.portas = portas;
    }

    @Override
    public void mover() {
        System.out.println(getModelo() + " está dirigindo na estrada.");
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }
}