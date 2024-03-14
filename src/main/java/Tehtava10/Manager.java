package Tehtava10;

class Manager implements Handler {
    private Handler nextHandler;

    @Override
    public void handleRequest(double amount) {
        if (amount > 2 && amount <= 5) {
            System.out.println("Yksikön päällikkö hyväksyi palkankorotuspyynnön " + amount + "%");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(amount);
        }
    }

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
