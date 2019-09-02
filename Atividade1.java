 public class atividade1 {
   
  public static void main(String[] args) {
 


  	int cateto1= 10;
  	int cateto2=20;
 double hipotenusa = teoremaPitagonas(cateto1, cateto2);
  }
 	
  private static double teoremaPitagonas(int cat1 , int cat2){
    double resultado = cat1*cat1 + cat2*cat2;
    double hipotenusa = Math.sqrt(resultado);
   return hipotenusa ; 
   
  }

}