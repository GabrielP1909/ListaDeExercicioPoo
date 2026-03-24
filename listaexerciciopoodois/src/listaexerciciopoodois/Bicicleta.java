package listaexerciciopoodois;

public class Bicicleta extends Veiculo {

    private boolean temMarcha;

    public Bicicleta(String marca, String modelo, int ano, boolean temMarcha) {
        super(marca, modelo, ano);
        this.temMarcha = temMarcha;
    }

    @Override
    public void mover() {
        System.out.println(getModelo() + " está sendo pedalada.");
    }

    public boolean isTemMarcha() {
        return temMarcha;
    }

    public void setTemMarcha(boolean temMarcha) {
        this.temMarcha = temMarcha;
    }
}