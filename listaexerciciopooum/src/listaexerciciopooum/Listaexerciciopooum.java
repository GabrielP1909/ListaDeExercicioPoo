package listaexerciciopooum;

public class Listaexerciciopooum {

    public static void main(String[] args) {

        Animal a1 = new Cachorro("Rex", 3, 10.5, "Labrador");
        Animal a2 = new Gato("Mimi", 2, 4.2, "Branco");
        Animal a3 = new Vaca("Mimosa", 5, 350.0, 20);
        Animal a4 = new Cavalo("Pé de Pano", 7, 500.0, "Corrida");

        a1.emitirSom();
        a2.emitirSom();
        a3.emitirSom();
        a4.emitirSom();
    }
}