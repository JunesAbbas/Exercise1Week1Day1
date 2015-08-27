package threadsexercise;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
//

    public static void main(String[] args) {
        Task1 task1= new Task1();
        Thread Thread1 = new Thread(task1);
        
        Task2 task2= new Task2();
        
        Thread Thread2= new Thread(task2);
        Task3 task3= new Task3();
        Thread Thread3 = new Thread(task3);
      
        
        Thread1.start();
        Thread2.start();
        Thread3.start();
        
    
        
        
        
    }

}
