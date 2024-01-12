package example_1;

public class SuniyCar {
    int batarekaCarCount;
    double quvvatMatorCar;

    public SuniyCar(int batarekaCarCount, double quvvatMatorCar) {
        this.batarekaCarCount = batarekaCarCount;
        this.quvvatMatorCar = quvvatMatorCar;
    }

    public int getBatarekaCarCount() {
        return batarekaCarCount;
    }

    public void setBatarekaCarCount(int batarekaCarCount) {
        this.batarekaCarCount = batarekaCarCount;
    }

    public double getQuvvatMatorCar() {
        return quvvatMatorCar;
    }

    public void setQuvvatMatorCar(double quvvatMatorCar) {
        this.quvvatMatorCar = quvvatMatorCar;
    }

    boolean run(Battary battary, int time) {//time sekunda, kerak emasmi deman
        if (getQuvvatMatorCar() <= getBatarekaCarCount() * battary.getBatteryCapacity() * battary.migration) { // P=U*I
            return true;
        }
        return false;
    }
    int getBattaryInfo(Battary  battary){
        return battary.getBatteryCapacity();
    }
    boolean addBattary(Battary battary){
        return true;
    }

}
