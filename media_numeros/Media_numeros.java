/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package media_numeros;
import java.util.Scanner;


/**
 *
 * @author jafet
 */
public class Media_numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner jf = new Scanner(System.in);
        
        float numeros_positivos=0,numeros_negativos=0;
        float sumas_positivas=0,sumas_negativas=0;
        int numeros_ceros=0;
        float sumaP =0,sumaN=0;
        float restaP=0,restaN=0;
        
        System.out.println("Por favor escriba 5 numeros");
        
        float numeros[]= new float[5];
        for(int i=0;i<5;i++){
            System.out.println((i+1)+". Numero: ");
            numeros[i]=jf.nextFloat();
            
            if(numeros[i]==0){
                numeros_ceros++;
            }else if(numeros[i]>0){
                    sumaP+=numeros[i];
                 restaP-=numeros[i];
               numeros_positivos += numeros[i];
               sumas_positivas++;
            }else{
             numeros_negativos += numeros[i];
             sumaN+=numeros[i];
              restaN-=numeros[i];
             sumas_negativas++;
            }
            
            
        }  
        
          if(sumas_positivas==0){
              System.out.println("No se puede dividir entre cero");
          }else{
              System.out.println("Suma positiva: "+sumaP);
              System.out.println("Resta positiva: " + restaP);
                  float division_positiva = numeros_positivos/sumas_positivas;
            System.out.println("Media positiva: "+ division_positiva);
          }
          if(sumas_negativas==0){
              System.out.println("No se puede dividir entre 0");
          
          }else{
               System.out.println("Suma positiva: "+sumaN);
              System.out.println("Resta positiva: "+restaN);
           float division_negativa = numeros_negativos/sumas_negativas;
            System.out.println("Media positiva: "+ division_negativa);
          }
          System.out.println("Cantidad de numeros ceros: "+numeros_ceros);
    }
    
}
