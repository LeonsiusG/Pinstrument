public class PlayInstrument {
    String type;
    double price;

    // Default constructor
    public PlayInstrument() {
        this.type = "Unknown";
        this.price = 0.0;
    }

    // Parameter constructor
    public PlayInstrument(String type, double price) {
        this.type = type;
        this.price = price;
    }

    // Print method
    public void print() {
        System.out.println("Type: " + type + ", Price: " + price);
    }
}
