package generic;
interface Box<T> {
    T getGift();
}

class GiftBox<T> implements Box<T> {
    private T gift;                
    public GiftBox(T gift) {      
        this.gift = gift;
    }

    public T getGift() {           
        return gift;
    }
}

public class Interface {
    public static void main(String[] args) {
        GiftBox<String> strBox = new GiftBox<>("box");
        GiftBox<Integer> intBox = new GiftBox<>(13);

        System.out.println("Str Box = " + strBox.getGift());
        System.out.println("Int Box = " + intBox.getGift());
    }
}