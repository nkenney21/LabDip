/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dip.lab3.student.solution1;

/**
 *
 * @author neilkenney
 */
public class HelloWorldMessage implements Message{

   private final String str = "Hello World";

    @Override
    public String getMessage() {
        return str;
    }
}
