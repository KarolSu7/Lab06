public class Statek implements  Plywa{

    private String a;

    public void setA(String a){
        this.a = a;
    }

    public String getA(){
        return a;
    }

    @Override
    public String Plyn() {
        return a;
    }
}
