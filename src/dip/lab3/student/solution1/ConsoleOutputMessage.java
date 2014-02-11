
package dip.lab3.student.solution1;

/**
 *
 * @author neilkenney
 */
public class ConsoleOutputMessage implements MessageOutput{
    
    @Override
    public void sendMessage(Message e){
        System.out.println(e.getMessage());
    }
    
}
