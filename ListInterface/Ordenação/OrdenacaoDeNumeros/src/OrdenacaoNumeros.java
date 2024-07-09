import java.util.ArrayList;
import java.util.List;

public class OrdenacaoNumeros {
    
    List<Integer> numeroList;

   public OrdenacaoNumeros(){
    this.numeroList = new ArrayList<>();
   }
   public void adicionarNumero(int numero){
    numeroList.add(new Integer(numero));
   }
   
}
