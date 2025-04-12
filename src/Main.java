public class Main {
    public static void main(String[] args) {
        Fighter fighter = new Fighter(ModelNames.Noname, 2020, EngineTypes.Reactive, 2, FighterTypes.MP);
        Fighter fighter2 = new Fighter(ModelNames.Noname, 2020, EngineTypes.Reactive, 2, FighterTypes.MP);
        Helicopter helicopter = new Helicopter(ModelNames.Noname, 2018, EngineTypes.Reactive, 6, 8);
        Airplane airplane = new Airplane(ModelNames.Noname, 2023, EngineTypes.Reactive, 12, 120, 20000);
        System.out.println(fighter2.equals(fighter));
    }
}