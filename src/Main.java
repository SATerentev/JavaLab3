public class Main {
    public static void main(String[] args) {
        Airplane asd = new Airplane(ModelNames.AEROSTAR_3000, 2020, EngineTypes.HYBRID, 6, 180, 30000);
        System.out.printf(asd.toString());
    }
}