package sqlproject;

import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Laura Jurisic
 */
public class Controller {
    
    public Controller() {
    
    }
    
    public void searchTable(JButton jb, JTextArea jta) {
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                // create prepared statement SELECT * FROM restaurant WHERE rOrigin = jb.getText() (American/Italian for now)
                // perhaps.
                // search table based on name of pressed button
                // ???
                jta.setText(jb.getText());
            }
        });
        
        
    }
    
}
