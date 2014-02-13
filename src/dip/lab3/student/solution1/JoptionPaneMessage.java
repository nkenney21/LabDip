

package dip.lab3.student.solution1;

import javax.swing.JOptionPane;

/**
 *
 * @author neilkenney
 */
public class JoptionPaneMessage implements MessageOutput {
    
  

    @Override
    public void sendMessage(MessageInput e) {
        JOptionPane.showMessageDialog(null, e.getMessage());
    }
    
}
