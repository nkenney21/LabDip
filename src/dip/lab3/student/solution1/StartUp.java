
package dip.lab3.student.solution1;

/**
 *
 * @author neilkenney
 */
public class StartUp {
    public static void main(String[] args) {
        MessageInput msg = new RandomMessage();
        MessageOutput mOut = new ConsoleOutputMessage();
        MessageService mServ = new MessageService();
        
        
        mServ.createMessage(msg, mOut);
    }
}
