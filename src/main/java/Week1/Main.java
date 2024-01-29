package Week1;

public class Main {

    public static void main(String[] args) {
        AterioivaOtus opettaja = new Opettaja();
        AterioivaOtus luokkaA = new LuokanA();
        AterioivaOtus luokkaB = new LuokanB();


        opettaja.aterioi();
        System.out.println();

        luokkaA.aterioi();
        System.out.println();

        luokkaB.aterioi();
    }
}
