package Products.Instruments;

public class Trumpet extends Instrument {
    private int totalValves;

    public Trumpet(String instrumentMaterial, String color, InstrumentType type,int totalValves){
        super(instrumentMaterial,color,type);
        this.totalValves = totalValves;
    }

    public int getTotalValves() {
        return totalValves;
    }
    public String playInstrument(){
        return "Pom Pom";
    }
}
