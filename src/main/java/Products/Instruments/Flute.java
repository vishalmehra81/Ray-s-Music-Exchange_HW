package Products.Instruments;

public class Flute extends Instrument {
    private int totalFingerHoles;

    public Flute(String instrumentMaterial, String color, InstrumentType type,int totalFingerHoles){
        super(instrumentMaterial,color,type);
        this.totalFingerHoles = totalFingerHoles;
    }

    public int getTotalFingerHoles() {
        return totalFingerHoles;
    }
    public String playInstrument(){
        return "Too Tooo To";
    }
}
