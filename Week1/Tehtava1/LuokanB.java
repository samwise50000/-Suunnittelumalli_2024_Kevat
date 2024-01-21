package factorymethod;

public class LuokanB extends AterioivaOtus {

    public Juoma createJuoma(){
        return new Kahvi();
    }
    
}
