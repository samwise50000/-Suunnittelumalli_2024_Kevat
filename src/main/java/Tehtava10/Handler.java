package Tehtava10;

interface Handler {
    void handleRequest(double amount);
    void setNextHandler(Handler nextHandler);
}