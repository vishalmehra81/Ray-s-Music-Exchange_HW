package Products.Instruments;

public class Piano extends Instrument {
    private int totalKeys;
    private int totalStrings;

    public Piano(String instrumentMaterial, String color, InstrumentType type, int totalKeys, int totalStrings) {
        super(instrumentMaterial, color, type);
        this.totalKeys = totalKeys;
        this.totalStrings = totalStrings;
    }

    public int getTotalKeys() {
        return totalKeys;
    }

    public int getTotalStrings() {
        return totalStrings;
    }

    public String playInstrument() {
        return "Ding Ding";
    }

}
