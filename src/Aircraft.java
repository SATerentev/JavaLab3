import java.security.InvalidParameterException;

public abstract class Aircraft {
    protected ModelNames model;
    protected int productionYear;
    protected int crewCount;
    protected EngineTypes engineType;

    protected Aircraft(ModelNames model, int productionYear, int crewCount, EngineTypes engineType){
        if (productionYear < 0 || productionYear > java.time.Year.now().getValue() && crewCount < 0 || crewCount > 100)
            throw new InvalidParameterException();

        this.model = model;
        this.productionYear = productionYear;
        this.crewCount = crewCount;
        this.engineType = engineType;
    }

    public ModelNames getModel() { return model; }
    public EngineTypes getEngineType() { return engineType; }
    public int getProductionYear() { return productionYear; }
    public int getCrewCount() { return crewCount; }

    public void setModel(ModelNames model) { this.model = model; }
    public void setEngineType(EngineTypes engineType) { this.engineType = engineType; }
    public void setProductionYear(int productionYear){
        if (productionYear > 0 && productionYear < java.time.Year.now().getValue()) this.productionYear = productionYear;
    }
    public void setCrewCount(int crewCount){
        if (crewCount > 0 && crewCount < 100) this.crewCount = crewCount;
    }
}