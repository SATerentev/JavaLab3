import java.security.InvalidParameterException;

public class Airplane extends Aircraft {
    private int flightRange;
    private int passengersCount;

    public Airplane(ModelNames model, int productionYear, EngineTypes engineType, int crewCount, int passengersCount, int flightRange){
        super(model, productionYear, crewCount, engineType);
        if (passengersCount < 0 || passengersCount >= 1000 || flightRange <= 0 || flightRange > 100000) throw new InvalidParameterException();
        this.passengersCount = passengersCount;
        this.flightRange = flightRange;
    }

    public int getPassengersCount() { return passengersCount; }
    public int getFlightRange() { return flightRange; }

    public void setPassengersCount(int passengersCount){
        if (passengersCount >= 0 && passengersCount < 1000) this.passengersCount = passengersCount;
    }
    public void setFlightRange(int flightRange){
        if (flightRange > 0 && flightRange <= 100000) this.flightRange = flightRange;
    }

    @Override
    public boolean equals(Object object){
        if (!(object instanceof Airplane)) return false;
        if (object == null) return false;
        return ((Airplane) object).getModel().equals(this.getModel()) && ((Airplane) object).getProductionYear() == this.getProductionYear() &&
                ((Airplane) object).getEngineType().equals(this.getEngineType()) && ((Airplane) object).getCrewCount() == this.getCrewCount() &&
                ((Airplane) object).passengersCount == this.passengersCount && ((Airplane) object).flightRange == this.flightRange;
    }

    @Override
    public String toString(){
        return String.format("Самолёт\nМодель: %s\nГод производства: %d\nТип двигателя: %s\n" +
                "Кол-во членов экипажа: %d\nДальность полёта: %s\nКол-во пассажиров: %d", this.getModel(), this.getProductionYear(),
                this.getEngineType(), this.getCrewCount(), flightRange, passengersCount);
    }
}
