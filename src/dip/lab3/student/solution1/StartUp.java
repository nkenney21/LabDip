/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dip.lab3.student.solution1;

/**
 *
 * @author neilkenney
 */
public class StartUp {
    public static void main(String[] args) {
        Message msg = new RandomMessage();
        MessageOutput mOut = new ConsoleOutputMessage();
        MessageService mServ = new MessageService();
        
        
        mServ.createMessage(msg, mOut);
    }
}
