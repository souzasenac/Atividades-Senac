 public class atividade2 {
   
  public static void main(String[] args) {
 double lado1 = 5;
 double lado2 = 15;
 
  double mariola = misturaGoiaba(lado1, lado2);
  }
 private static double misturaGoiaba(double l1, double l2){	
     double perimetro = l1 *2 + l2*2; 
     double area = l1 *l2;
     double resultado  = perimetro + area ;
     return resultado;
 }

}