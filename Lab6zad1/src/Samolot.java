public class Samolot implements Lata{

    private double b;

    public void setB(double b){
        this.b = b;
    }

    public double getB(int i){
        return b;
    }

    @Override
    public double Lec() {
        return b;
    }
}
