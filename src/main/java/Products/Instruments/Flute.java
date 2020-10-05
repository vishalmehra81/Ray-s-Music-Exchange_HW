package Products.Instruments;

public class Flute {
    private int totalFingerHoles;

    public Flute(int totalFingerHoles){
        this.totalFingerHoles = totalFingerHoles;
    }

    public int getTotalFingerHoles() {
        return totalFingerHoles;
    }
    public String playInstrument(){
        return "Too Tooo To";
    }
}
