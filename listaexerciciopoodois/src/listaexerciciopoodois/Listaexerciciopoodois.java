package listaexerciciopoodois;

public class Listaexerciciopoodois {

    public static void main(String[] args) {

        Veiculo v1 = new Carro("Toyota", "Corolla", 2020, 4);
        Veiculo v2 = new Moto("Honda", "CB500", 2021, 500);
        Veiculo v3 = new Bicicleta("Caloi", "Elite", 2019, true);
        Veiculo v4 = new Onibus("Mercedes", "Urbano", 2018, 50);

        v1.mover();
        v2.mover();
        v3.mover();
        v4.mover();
    }
}