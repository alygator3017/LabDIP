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
public class MessageService {
    //using input and output to get to the methods in order to pass
    //whatever line of input is need to output to where ever you want 
    //to output.
    private InputService message;
    private OutputService output;
    
    //create constructor to handle the message and output
    public MessageService(InputService message, OutputService output){
        this.message = message;
        this.output = output;
    }
    
    //pass the message to the output service
    public void sendMessage(){
        //gets the string, whichever that is, from the input
        String line = message.getInput();
        //output
        output.outputLn(line);
        
    }
}
