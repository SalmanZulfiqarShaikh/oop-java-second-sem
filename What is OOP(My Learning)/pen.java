 class Innerpen {
  String color;
    String type;

    public void info() {
        System.out.println("writing something");
        System.out.println(this.color);
        System.out.println(this.type);
    }
    
}

public class pen {

    
    public static void main(String[] args) {
       
       Innerpen pen1 = new Innerpen();
         pen1.color = "blue";
         pen1.type = "ballpoint";

         pen1.info();

    }
}
