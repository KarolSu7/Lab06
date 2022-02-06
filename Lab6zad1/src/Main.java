public class Main {
    public static void main(String [] args){

        Statek St1 = new Statek();
        St1.setA("Plynie az fale robi");
        System.out.println("Statek: "+ St1.Plyn());

        Samolot Sm1 = new Samolot();
        Sm1.setB(350);
        System.out.println("Samolot leci z predkoscia: "+ Sm1.Lec()+" km/h i leci");
    }
}
