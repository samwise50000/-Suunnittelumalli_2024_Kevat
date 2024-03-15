package Tehtava12;
import java.util.ArrayList;
import java.util.List;

public class ProxyExample {
    public static void main(String[] args) {
        List<Image> photoAlbum = new ArrayList<>();

        // Lisätään valokuvat valokuvakansioon proxyinä
        photoAlbum.add(new ProxyImage("Photo1"));
        photoAlbum.add(new ProxyImage("Photo2"));
        photoAlbum.add(new ProxyImage("Photo3"));

        // Tulostetaan valokuvakansion sisältö
        System.out.println("Valokuvakansion sisältö:");
        for (Image image : photoAlbum) {
            image.showData();
        }

        // Kuvien lataaminen ja näyttäminen tarvittaessa
        for (Image image : photoAlbum) {
            image.displayImage();
        }
    }
}