/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
