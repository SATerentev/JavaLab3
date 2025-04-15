import java.security.InvalidParameterException;
import java.util.Map;

public class AircraftFactory {
    public static final String MODEL = "model";
    public static final String PRODUCTION_YEAR = "productionYear";
    public static final String ENGINE_TYPE = "engineType";
    public static final String CREW_COUNT = "crewCount";
    public static final String FLIGHT_RANGE = "flightRange";
    public static final String PASSENGERS_COUNT = "passengersCount";
    public static final String FIGHTER_TYPE = "fighterType";
    public static final String BLADES_COUNT = "bladesCount";

    private AircraftFactory() {}

    public static Aircraft getNewAircraft(AircraftTypes type, Map<String, Object> params) throws Exception {
        ModelNames model;
        int year;
        int crewCount;
        EngineTypes engine;

        if (!params.containsKey(MODEL)) throw new InvalidParameterException("Отсутствует " + MODEL);
        if (!params.containsKey(PRODUCTION_YEAR)) throw new InvalidParameterException("Отсутствует " + PRODUCTION_YEAR);
        if (!params.containsKey(CREW_COUNT)) throw new InvalidParameterException("Отсутствует " + CREW_COUNT);
        if (!params.containsKey(ENGINE_TYPE)) throw new InvalidParameterException("Отсутствует " + ENGINE_TYPE);

        try{
            model = (ModelNames) params.get(MODEL);
            year = (int) params.get(PRODUCTION_YEAR);
            crewCount = (int) params.get(CREW_COUNT);
            engine = (EngineTypes) params.get(ENGINE_TYPE);

            switch (type){
                case Airplane:
                    if (!params.containsKey(PASSENGERS_COUNT) || !params.containsKey(FLIGHT_RANGE))
                        throw new InvalidParameterException("Отсутствует " + PASSENGERS_COUNT + " или " + FLIGHT_RANGE);
                    return new Airplane(model, year, engine, crewCount, (int) params.get(PASSENGERS_COUNT), (int) params.get(FLIGHT_RANGE));
                case Fighter:
                    if (!params.containsKey(FIGHTER_TYPE)) throw new InvalidParameterException("Отсутствует " + FIGHTER_TYPE);
                    return new Fighter(model, year, engine, crewCount, (FighterTypes) params.get(FIGHTER_TYPE));
                case Helicopter:
                    if (!params.containsKey(BLADES_COUNT)) throw new InvalidParameterException("Отсутствует " + BLADES_COUNT);
                    return new Helicopter(model, year, engine, crewCount, (int) params.get(BLADES_COUNT));
                default:
                    throw new Exception("Неизвестный тип воздушного судна");
            }
        } catch (ClassCastException e) {
            throw new InvalidParameterException("В параметры передан неправильный тип данных");
        }
    }

//    public Aircraft getRandomAircraft(){
//          TODO: реализовать метод
//    }
//
//    public Aircraft getRandomAircraft(AircraftTypes type){
//          TODO: реализовать метод
//    }
}
