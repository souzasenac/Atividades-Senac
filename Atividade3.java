/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

/**
 *
 * @author sala302b
 */
public class Atividade3 {
    public static void main(String[] args ){
        
    String string1= "o rato roeu a roupa";
    String string2= "do rei de roma";
    
    String frase = string1 + string2;
    
    String texto =confere(frase);
        System.out.println(texto);
    }
    private static String confere(String frase1 ){ 
    
        
    String resultado=frase1.replace("a" , "1").replace("e" , "2").replace("i" , "3").replace("o" , "4").replace("u" , "5") ;
     return resultado;
    }
            }
