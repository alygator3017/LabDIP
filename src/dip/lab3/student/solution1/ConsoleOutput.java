/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

/**
 *
 * @author Alyson
 */
public class ConsoleOutput implements OutputService{

    @Override
    public void outputLn(String line) {
        System.out.println(line);
    }
    
}
