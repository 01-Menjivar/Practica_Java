
package com.mycompany.showmessagedialog;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.QUESTION_MESSAGE;


public class main {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Mensaje de  pregunta", "PREGUNTA", QUESTION_MESSAGE);
        ImageIcon icon = new ImageIcon("C:\\Users\\menji\\OneDrive\\Escritorio\\caritafeliz.png");
        JOptionPane.showMessageDialog(null, "Carita feliz", "icono", QUESTION_MESSAGE, icon);
        
    }
    
    
    
}
