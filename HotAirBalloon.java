public class HotAirBalloon extends AirTransportation {
    private String pattern;
    private int numBurners;


    public HotAirBalloon(int speed, double cost, String purchaseType, String numPassengers, String pattern, int numBurners){
        super(speed, cost, purchaseType, numPassengers);
        this.pattern = pattern;
        this.numBurners = numBurners;
    }

    public String pattern(){
        return this.pattern;
    }

    public int getNumBurners(){ return this.numBurners; }

    public void setPattern(String pattern) {this.pattern = pattern; }

    public void setNumBurners(int numBurners) { this.numBurners = numBurners; }
}
