package factorymethod;

public class LuokanA extends AterioivaOtus {

    public Juoma createJuoma() {
        return new Kivennäisvesi();
    }
    
}
