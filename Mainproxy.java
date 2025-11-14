// Interface
package string;

interface Image {
    void display();
}

// Real Image class
class RealImage implements Image {
    public void display() {
        System.out.println("Displaying image");
    }
}

// Proxy Image class
class ProxyImage implements Image {
    private RealImage realImage;

    public void display() {
        if (realImage == null) {
            realImage = new RealImage();
            System.out.println("Proxy: Loading image");
        }
        realImage.display();
    }
}

// Main class
public class Mainproxy {
    public static void main(String[] args) {
        Image i = new ProxyImage();
        i.display();
    }
}
