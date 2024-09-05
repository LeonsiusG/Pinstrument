public class PlayInstruments {
    public static void main(String[] args) {
        // buat object untuk instrument
        PlayInstrument a = new PlayInstrument("Guitar", 250);
        PlayInstrument b = new PlayInstrument("Piano", 200.0);
        PlayInstrument c = new PlayInstrument("Violin", 300.9);

        // Print setiap detail instrument
        a.print();
        b.print();
        c.print();

        // Simpulkan instrument mana yang paling mahal
        PlayInstrument termahal;

        if (a.price >= b.price && a.price >= c.price) {
            termahal = a;
        } else if (b.price >= a.price && b.price >= c.price) {
            termahal = b;
        } else {
            termahal = c;
        }

        // Print instrument yang paling mahal
        System.out.println("Instrument paling mahal adalah:");
        termahal.print();
    }
}
