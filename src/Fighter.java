public class Fighter extends Aircraft {
    private FighterTypes type;

    public Fighter(ModelNames model, int productionYear, EngineTypes engineType, int crewCount, FighterTypes type){
        super(model, productionYear, crewCount, engineType);
        this.type = type;
    }

    public FighterTypes getFighterType() { return type; }
    public void setFighterType(FighterTypes fighterType) { type = fighterType; }

    @Override
    public boolean equals(Object object){
        if (!(object instanceof Fighter)) return false;
        if (object == null) return false;
        return ((Fighter) object).getModel().equals(this.getModel()) && ((Fighter) object).getProductionYear() == this.getProductionYear() &&
                ((Fighter) object).getEngineType().equals(this.getEngineType()) && ((Fighter) object).getCrewCount() == this.getCrewCount() &&
                ((Fighter) object).type.equals(this.type);
    }

    @Override
    public String toString(){
        return String.format("Истребитель\nМодель: %s\nГод производства: %d\nТип двигателя: %s\n" +
                "Кол-во членов экипажа: %d\nКласс: %s\n", this.getModel(), this.getProductionYear(), this.getEngineType(), this.getCrewCount(), type);
    }
}
