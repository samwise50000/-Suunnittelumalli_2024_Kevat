package Tehtava10;

class Supervisor implements Handler {
    private Handler nextHandler;

    @Override
    public void handleRequest(double amount) {
        if (amount <= 2) {
            System.out.println("Lähiesimies hyväksyi palkankorotuspyynnön " + amount + "%");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(amount);
        }
    }

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
}