import java.security.InvalidParameterException;

public class Helicopter extends Aircraft {
    private int bladesCount;

    public Helicopter(ModelNames model, int productionYear, EngineTypes engineType, int crewCount, int bladesCount){
        super(model, productionYear, crewCount, engineType);
        if (bladesCount <= 0 || bladesCount >= 100) throw new InvalidParameterException();
        this.bladesCount = bladesCount;
    }

    public int getBladesCount() { return bladesCount; }
    public void setBladesCount(int bladesCount){
        if (bladesCount > 0 && bladesCount < 100) this.bladesCount = bladesCount;
    }

    @Override
    public boolean equals(Object object){
        if (!(object instanceof Helicopter)) return false;
        if (object == null) return false;
        return ((Helicopter) object).getModel().equals(this.getModel()) && ((Helicopter) object).getProductionYear() == this.getProductionYear() &&
                ((Helicopter) object).getEngineType().equals(this.getEngineType()) && ((Helicopter) object).getCrewCount() == this.getCrewCount() &&
                ((Helicopter) object).bladesCount == this.bladesCount;
    }

    @Override
    public String toString(){
        return String.format("Вертолёт\nМодель: %s\nГод производства: %d\nТип двигателя: %s\n" +
                "Кол-во членов экипажа: %d\nКол-во лопастей: %d\n", this.getModel(), this.getProductionYear(), this.getEngineType(), this.getCrewCount(), bladesCount);
    }
}
