public class Main {
    public static void main(String[] args) {
        Zwierze wielotyb = new Zwierze();
        wielotyb.Seta("je");
        System.out.println("Wieloryb: "+wielotyb.jedz());

        wielotyb.SetB("Wydala");
        System.out.println("Wieloryb: "+wielotyb.wydalaj());
        System.out.println("Wieloryb: "+wielotyb.Plyn());
        System.out.println("Wieloryb: "+wielotyb.Wynurz());
        System.out.println("Wieloryb: "+wielotyb.Zanurz());
        System.out.println("Wieloryb: "+wielotyb.lec());
        System.out.println("Wieloryb: "+wielotyb.Wylonduj());
    }
}
