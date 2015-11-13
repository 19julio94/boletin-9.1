
package boletin91;

import javax.swing.JOptionPane;

/**
 *
 * @author jpatriciodasilva
 */
public class Contador {
  
    int positivo=0;
    int negativo=0;
    int cero=0;   
    
        
    
   
    
    public void validarNumero(int num){
       
            if (num>0){
            this.positivo++;
        }else{
            if (num <0){
            this.negativo++;
            
            }else{
            this.cero++;
            }
            
            }
    
    }
    public String enviarResultado(){
        String resultado="Numero de positivos "+positivo+"\nNumero de negativos "+negativo+"\nNumero de ceros "+cero;
                return resultado;
    }
}

