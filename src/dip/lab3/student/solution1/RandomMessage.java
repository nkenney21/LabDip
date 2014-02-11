/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dip.lab3.student.solution1;

import java.util.Random;

/**
 *
 * @author neilkenney
 */
public class RandomMessage implements Message{
    
    String[] msg = {"Hello World", "Goodbye World", "I love Java"};

   
    
    @Override
    public String getMessage() {
        Random r = new Random(System.nanoTime());
        int index = r.nextInt(msg.length);
        
        return msg[index];
    }
    
}
