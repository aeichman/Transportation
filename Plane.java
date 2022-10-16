public class Plane extends AirTransportation{
    private String engine;
    private int wingspan;



    public Plane(int speed, double cost, String purchaseType, String numPassengers, String engine, int wingspan){
        this.engine = engine;
        this.wingspan = wingspan;
    }

    public String getEngine() { return engine; }

    public int getWingspan() { return wingspan; }

    public void setEngine(String engine) { this.engine = engine; }

    public void setWingspan(int wingspan) { this.wingspan = wingspan;}
}
