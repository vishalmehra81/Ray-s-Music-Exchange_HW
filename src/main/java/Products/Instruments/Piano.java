package Products.Instruments;

public class Piano {
    private int totalKeys;
    private int totalStrings;
    public Piano(int totalKeys, int totalStrings){
        this.totalKeys = totalKeys;
        this.totalStrings = totalStrings;
    }

    public int getTotalKeys() {
        return totalKeys;
    }

    public int getTotalStrings() {
        return totalStrings;
    }
    public String play(){
        return "tong tong";
    }
}
