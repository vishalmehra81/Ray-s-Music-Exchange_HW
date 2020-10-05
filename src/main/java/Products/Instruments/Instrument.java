package Products.Instruments;

import Properties.IPlay;

public abstract class Instrument extends Product implements IPlay {
    public String instrumentMaterial;
    public String color;
    public InstrumentType type;

    public Instrument (String instrumentMaterial, String color, InstrumentType type){
        this.instrumentMaterial = instrumentMaterial;
        this.color = color;
        this.type = type;
    }

    public String getInstrumentMaterial() {
        return instrumentMaterial;
    }

    public String getColor() {
        return color;
    }

    public InstrumentType getType() {
        return type;
    }
}
