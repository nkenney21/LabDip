

package dip.lab3.student.solution1;

/**
 *
 * @author neilkenney
 */
public class HelloWorldMessage implements MessageInput{

   private final String str = "Hello World";

    @Override
    public String getMessage() {
        return str;
    }
}
