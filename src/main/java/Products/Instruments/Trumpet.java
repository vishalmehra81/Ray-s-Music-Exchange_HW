package Products.Instruments;

public class Trumpet {
    private int totalValves;

    public Trumpet(int totalValves){
        this.totalValves = totalValves;
    }

    public int getTotalValves() {
        return totalValves;
    }
    public String playInstrument(){
        return "Pom Pom";
    }
}
