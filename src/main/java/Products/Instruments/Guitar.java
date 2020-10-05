package Products.Instruments;

public class Guitar {
    private int totalStrings;

    public Guitar(int totalStrings){
        this.totalStrings = totalStrings;
    }
    public int getTotalStrings(){
        return totalStrings;
    }
    public String playInstrument(){
        return "ting ting";
    }
}
