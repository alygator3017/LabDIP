/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

import javax.swing.JOptionPane;

/**
 *
 * @author Alyson
 */
public class JOptionPaneOutput implements OutputService{

    @Override
    public final void outputLn(String line) {
        JOptionPane.showMessageDialog(null, line);
    }
    
}
