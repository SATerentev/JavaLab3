import java.security.InvalidParameterException;

public abstract class Aircraft {
    protected ModelNames model;
    protected int productionYear;
    protected int crewCount;
    protected EngineTypes engineType;

    public Aircraft(ModelNames model, int productionYear, int crewCount, EngineTypes engineType){
        if (productionYear < 0 || productionYear > java.time.Year.now().getValue() && crewCount < 0 || crewCount > 100)
            throw new InvalidParameterException();

        this.model = model;
        this.productionYear = productionYear;
        this.crewCount = crewCount;
        this.engineType = engineType;
    }
}