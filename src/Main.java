public class Main {
    public static void main(String[] args) {

        int num = 2000;
       int i = 2;
       int cont = 0;
       int x = 1;
       boolean comp = true;
       // si termina el while y comprobar vale 1 es primo

      while(cont < num) {
          x++;
          i = 2;
          comp = true;
          while (i < x) {
              //System.out.println("dividimos " + x + "/" + i);
              if (x % i == 0) {
                  comp = false;
              }
              i++;
          }

          if (comp) {
              cont++;
              System.out.println("El número " + x + " es primo");
          }
      }



    }
}