package listaexerciciopootres;

public class Listaexerciciopootres {

    public static void main(String[] args) {

        Funcionario f1 = new Gerente("Carlos", 5000, 10);
        Funcionario f2 = new Vendedor("Ana", 3000, 20000);
        Funcionario f3 = new Programador("Lucas", 15000, "Java");
        Funcionario f4 = new Designer("Marina", 3500, "Photoshop");

        f1.trabalhar();
        System.out.println("Bônus: " + f1.calcularBonus());

        f2.trabalhar();
        System.out.println("Bônus: " + f2.calcularBonus());

        f3.trabalhar();
        System.out.println("Bônus: " + f3.calcularBonus());

        f4.trabalhar();
        System.out.println("Bônus: " + f4.calcularBonus());
    }
}