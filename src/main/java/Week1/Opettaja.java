package Week1;

public class Opettaja extends AterioivaOtus {

    public Juoma createJuoma(){
        return new Vesi();
    };

}
