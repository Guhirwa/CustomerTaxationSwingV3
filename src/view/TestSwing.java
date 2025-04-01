package view;

import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 *
 * @author Guhirwa
 */
public class TestSwing {
    public static void main(String[] args) {
        JFrame waterContainer = new JFrame();
        waterContainer.setTitle("INYANGE WATER");
        waterContainer.setSize(400, 500);
        // creating component
        JTextArea comment = new JTextArea();
        comment.setSize(50, 20);
        waterContainer.add(comment);
        
        waterContainer.setVisible(true);
        waterContainer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
        
    }
}
