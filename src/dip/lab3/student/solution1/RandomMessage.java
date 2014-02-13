
package dip.lab3.student.solution1;

import java.util.Random;

/**
 *
 * @author neilkenney
 */
public class RandomMessage implements MessageInput{
    
    String[] msg = {"Hello World", "Goodbye World", "I love Java"};

   
    
    @Override
    public String getMessage() {
        Random r = new Random(System.nanoTime());
        int index = r.nextInt(msg.length);
        
        return msg[index];
    }
    
}
