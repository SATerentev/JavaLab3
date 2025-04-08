public class Airplane extends Aircraft {
    protected int flightRange;
    private int passangersCount;

    protected int getFlightRange(){
        return flightRange;
    }

    protected void setFlightRange(int flightRange){
        this.flightRange = flightRange;
    }

    public int getPassangersCount(){
        return passangersCount;
    }

    public void setPassangersCount(int passangersCount){
        this.passangersCount = passangersCount;
    }
}
