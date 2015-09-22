/*
 */
package dip.lab3.student.solution1;

/**
 *
 * @author Alyson
 */
public class WelcomeMessage implements MessageInput{
    private final String welcome = "Welcome! The cake is a lie.";
    @Override
    public final String getInput() {
     return welcome;   
    }
    
}
