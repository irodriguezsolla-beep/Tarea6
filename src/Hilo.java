import java.util.List;
import java.util.Arrays;
public class Hilo extends Thread{
    int paciencia;
    public  Hilo(String str,int paciencia){
        super(str);
        this.paciencia = paciencia;
    }
    public void run(){
      for(int i=0; i<=paciencia;i++){
          if (i==paciencia){
              System.out.println(getName()+" paciencia: "+i+" limite de paciencia alcanzado");
          }else{
              System.out.println(getName()+" paciencia: " + i);
          }
      }
    }
}
class Programa {
    public static void main(String[] args) {
        // Lista con los nombres a recorrer
        List<String> nombres = Arrays.asList("Diego", "Juan");
        int pacienciaPorDefecto = 5;

        // Recorremos la lista y creamos/iniciamos un hilo para cada nombre
        for (String nombre : nombres) {
            new Hilo(nombre, pacienciaPorDefecto).start();
        }

        System.out.println("--- Todos los hilos se han lanzado ---");
    }
}