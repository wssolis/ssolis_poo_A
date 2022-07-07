package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.Cliente;
import ec.edu.intsuperior.modelo.CuentaBancaria;
import ec.edu.intsuperior.modelo.Persona;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

public class Aplicacion {

    public static void main(String[] args) {
       Cliente cl1=new Cliente();
       cl1.setCi(JOptionPane.showInputDialog("por favor ingresa el numero de ci"));
        
       // int x=JOptionPane.showConfirmDialog(null,"oye deseas continuar");
         JOptionPane.showMessageDialog(null,cl1.getCi());
    }

}
