package boletin91;
import javax.swing.JOptionPane;
public class Boletin {

    
    public static void main(String[] args) {
        int positivo=0;
        int negativo=0;
        int cero=0;   
        int num=0;
        Contador cont1= new Contador();
       for(int x=0;x<10;x++){
           num=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero"));
           cont1.validarNumero(num);
    }
       JOptionPane.showMessageDialog(null, cont1.enviarResultado());
        }
    
}
