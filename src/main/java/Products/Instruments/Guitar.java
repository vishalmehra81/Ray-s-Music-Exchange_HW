package Products.Instruments;

public class Guitar extends Instrument {
    private int totalStrings;

    public Guitar(String instrumentMaterial, String color, InstrumentType type, int totalStrings){
        super(instrumentMaterial,color,type);
        this.totalStrings = totalStrings;
    }
    public int getTotalStrings(){
        return totalStrings;
    }
    public String playInstrument(){
        return "ting ting";
    }
}
