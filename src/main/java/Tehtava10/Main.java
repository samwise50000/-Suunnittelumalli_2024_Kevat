package Tehtava10;

public class Main {
    public static void main(String[] args) {
        // Luodaan vastuuketju
        Handler supervisor = new Supervisor();
        Handler manager = new Manager();
        Handler ceo = new CEO();

        supervisor.setNextHandler(manager);
        manager.setNextHandler(ceo);

        // Luodaan palkankorotuspyyntö
        RaiseRequest request = new RaiseRequest(4);

        // Lähetetään palkankorotuspyyntö ketjuun
        supervisor.handleRequest(request.getAmount());
    }
}
