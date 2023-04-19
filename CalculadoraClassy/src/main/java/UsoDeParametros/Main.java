/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UsoDeParametros;

import javax.swing.JOptionPane;

/**
 *
 * @author menji
 */
public class Main {

    public static void main(String[] args) {

        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite el primero numero"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero"));

        Calculadora c1 = new Calculadora();
        c1.Sumatoria(a, b);
        c1.MostrarDatos();

    }
}
