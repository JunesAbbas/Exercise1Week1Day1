/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadsexercise;

public class Task1 implements Runnable {

    @Override
    public void run() {

        long sum = 0;
        for (int i = 1; i <= 1000000000; i++) {
            sum += i;
        }

        System.out.println(sum);

    }
}
