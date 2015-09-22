/**
 * 
 */
package dip.lab3.student.solution1;

import javax.swing.JOptionPane;

/**
 *
 * @author Alyson
 */
public class JOptionPaneOutput implements MessageOutput{

    @Override
    public final void outputMessage(String line) {
        JOptionPane.showMessageDialog(null, line);
    }
    
}
