/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadsexercise;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Junes
 */
public class Task2 implements Runnable {

    @Override
    public void run() {

        try {
            for (int i = 1; i < 6; i++) {
              
                Thread.sleep(2000);
                System.out.println(i);
             
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
