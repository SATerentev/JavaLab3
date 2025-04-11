import java.security.InvalidParameterException;

public class Airplane extends Aircraft {
    protected int flightRange;
    private int passengersCount;

    // TODO: добавить проверки в конструктор
    public Airplane(ModelNames model, int productionYear, EngineTypes engineType, int crewCount, int passengersCount, int flightRange){
        super(model, productionYear, crewCount, engineType);
        if (passengersCount < 0 || passengersCount > 10000 || flightRange < 0 || flightRange > 100000) throw new InvalidParameterException();
        this.passengersCount = passengersCount;
        this.flightRange = flightRange;
    }

    @Override
    public String toString(){
        return String.format("Самолёт\nМодель: %s\nГод производства: %d\nТип двигателя: %s\n" +
                "Кол-во членов экипажа: %d\nДальность полёта: %s\nКол-во пассажиров: %d", model, productionYear, engineType, crewCount, flightRange, passengersCount);
    }
}
