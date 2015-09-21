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
public class StartUp {

    public static void main(String[] args) {
        //creating input obects
        InputService message1TOTD = new TipOfTheDayMessage();
        InputService message2W = new WelcomeMessage();
        //creating output objects
        OutputService output1C = new ConsoleOutput();
        OutputService output2GUI = new GUIOutput();

        //use constructor to pass any slected input and output
        MessageService message = new MessageService(message1TOTD, output2GUI);
        
        //call sendMessage message in order to retrieve message
        message.sendMessage();
    }

}
