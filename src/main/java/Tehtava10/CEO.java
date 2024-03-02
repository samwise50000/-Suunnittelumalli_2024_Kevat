package Tehtava10;

class CEO implements Handler {
    @Override
    public void handleRequest(double amount) {
        if (amount > 5) {
            System.out.println("Toimitusjohtaja hyväksyi palkankorotuspyynnön " + amount + "%");
        } else {
            System.out.println("Palkankorotuspyyntö hylättiin.");
        }
    }

    @Override
    public void setNextHandler(Handler nextHandler) {
        // Ei toteuteta, koska toimitusjohtaja on viimeinen käsittelijä ketjussa
    }
}