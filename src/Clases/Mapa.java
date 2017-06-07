
package Clases;

import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.swing.BrowserView;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Mapa {
    
    public static void main(String[] args) {
       
        final Browser browser = new Browser(); //clase crowser
        BrowserView view = new BrowserView(browser);
 
        final JTextField addressBar = new JTextField("https://www.google.com/maps/");
        addressBar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                browser.loadURL(addressBar.getText());
            }
        });
 
        
        JPanel addressPane = new JPanel(new BorderLayout());
        addressPane.add(new JLabel(" URL: "), BorderLayout.WEST); //aparece el rotulo URL y luego la barra
        addressPane.add(addressBar, BorderLayout.CENTER);  //aparece la barra de direccion
 
        JFrame frame = new JFrame("Detalles de Rutas"); //titulo de la ventana
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(addressPane, BorderLayout.NORTH);
        frame.add(view, BorderLayout.CENTER);
        frame.setSize(800, 500);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
        
 
        browser.loadURL(addressBar.getText());//cargar lo que esta en la barra
    }
    
    
}
