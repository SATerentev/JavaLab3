public class Fighter extends Aircraft {
    private FighterTypes type;

    public Fighter(ModelNames model, int productionYear, EngineTypes engineType, int crewCount, FighterTypes type){
        super(model, productionYear, crewCount, engineType);
        this.type = type;
    }

    @Override
    public String toString(){
        return String.format("Истребитель\nМодель: %s\nГод производства: %d\nТип двигателя: %s\n" +
                "Кол-во членов экипажа: %d\nКласс: %s\n", model, productionYear, engineType, crewCount, type);
    }
}
