public class Zwierze extends Ryba implements Plywanie, Latanie{

   public String a;

   public void Seta(String a){
      this.a = a;
   }
   String jedz(){
      return a;
   }
public void SetB(String a){
      this.a =a;

}
   @Override
   String wydalaj() {
      return a;
   }


   @Override
   public String Plyn() {
      return "plynie";
   }

   @Override
   public String Wynurz() {
      return "Wynurza";
   }

   @Override
   public String Zanurz() {
      return "Zanurza";
   }

   @Override
   public String lec() {
      return "nie lata";
   }

   @Override
   public String Wylonduj() {
      return "nie londuje";
   }
}
