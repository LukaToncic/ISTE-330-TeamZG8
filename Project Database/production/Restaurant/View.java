package sqlproject;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Laura Jurisic
 */

public class View {

    public View() {
        createGUI();
    }

    public void createGUI() {
        JFrame jfR = new JFrame();
        JPanel jpN = new JPanel();
        JPanel jpC = new JPanel();
        JPanel jpS = new JPanel();
        
        JButton jbAmer = new JButton("American");
        JButton jbItal = new JButton("Italian");
        
        JLabel jl = new JLabel("<html><body style='width: 350px'>What sort of food do you feel like eating?</body></html>");
        JTextArea jtR = new JTextArea(20, 50);
        
        Controller ctrl = new Controller();
        
        ctrl.searchTable(jbAmer, jtR);
        ctrl.searchTable(jbItal, jtR);
        
        jl.setFont(new Font("Sans Serif", Font.BOLD, 28));
        jl.setForeground(new Color(99, 185, 86));
        
        jpN.add(jl);
        
        jpC.add(jbAmer);
        jpC.add(jbItal);
        
        jpS.add(jtR);
        
        jfR.add(jpN, BorderLayout.NORTH);
        jfR.add(jpC, BorderLayout.CENTER);
        jfR.add(jpS, BorderLayout.SOUTH);
        
        jfR.setSize(500, 500);
        jfR.setVisible(true);
        jfR.setLocationRelativeTo(null);
        jfR.setDefaultCloseOperation(jfR.EXIT_ON_CLOSE);
    }

}