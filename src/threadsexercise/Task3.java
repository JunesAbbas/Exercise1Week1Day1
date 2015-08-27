/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadsexercise;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Junes
 */
public class Task3 implements Runnable {

    boolean terminate = true;

   

    @Override
    public void run() {

        long num = 10;
        try {
            while (terminate) {
                num++;
                System.out.println(num);
                sleep(3000);
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Task3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void terminate(boolean x) {
        terminate = x;
    }

}
