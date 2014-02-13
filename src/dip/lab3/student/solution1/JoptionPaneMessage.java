

package dip.lab3.student.solution1;

import javax.swing.JOptionPane;

/**
 *
 * @author neilkenney
 */
public class JoptionPaneMessage implements MessageOutput {
    
  

    @Override
    public void sendMessage(Message e) {
        JOptionPane.showMessageDialog(null, e.getMessage());
    }
    
}
