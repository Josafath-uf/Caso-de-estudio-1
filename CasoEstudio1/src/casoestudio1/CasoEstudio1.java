/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casoestudio1;
import javax.swing.JOptionPane;
/**
 *
 * @author minil
 */
public class CasoEstudio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre;
        int cedula;
        int codigo;
        String sucursal;
        String lectura1;
        String lectura;
        String vehiculo;

        nombre = JOptionPane.showInputDialog("Digite su nombre");

        sucursal = JOptionPane.showInputDialog("En cual sucursal trabaja");

        lectura = JOptionPane.showInputDialog("Digite su cedula");
        cedula = Integer.parseInt(lectura);

        lectura1 = JOptionPane.showInputDialog("Digite su codigo");
        codigo = Integer.parseInt(lectura1);

        vehiculo = JOptionPane.showInputDialog("Usted tiene vehiculo propio?");
        
        JOptionPane.showMessageDialog(null, "El vendedor " + vehiculo + " tiene vehiculo propio");
        
        JOptionPane.showMessageDialog(null, "Sucursal: "+ sucursal);
        
        

    }

}
