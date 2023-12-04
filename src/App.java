import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
    /*System.out.println(Thread.activeCount());
        System.out.println(Runtime.getRuntime().availableProcessors());

        //Démarrage d'un Thread
        System.out.println("######### Démarrage d'un Thread ########");
        System.out.println(Thread.currentThread().getName());
        /*for (int i=0; i<5; i++){
            Thread thread = new Thread(() -> System.out.println(Thread.currentThread().getName()));
            thread.start();
        }*/


        //Mise en pause d'un Thread
        /*System.out.println("######### Mise en pause d'un Thread ###########");
        for (int i=0; i<5; i++){
            Thread thread = new Thread(new Task());
            thread.start();
        }*/

        System.out.println("######### Adhésion d'un Thread ###########");
        System.out.println(Thread.currentThread().getName());
        //Thread thread2 = new Thread(new Task());
        
        /*try {
            thread2.join(); //Permet d'attendre la fin dun thread avant de terminer la classe/fct appelante /!\ ne pas utiliser dans main()
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+" finished");*/

        System.out.println("###### Interruption d'un Thread #######");
        /*thread2.start();
        try {
            thread2.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        //thread2.interrupt(); //Envoi seulement une requête stop au thread

        //Concurrence entre thread
        System.out.println("Concurrence entre thread");
        System.out.println(Thread.currentThread().getName());
        
        List<Calculator> calculators = new ArrayList<Calculator>();
        List<Thread> threads = new ArrayList<Thread>();
        /*for (int i = 0; i <5; i++) {
            Calculator calculator = new Calculator();
            Thread thread = new Thread(new Task(calculator));
            thread.start();
            threads.add(thread);
            calculators.add(calculator);
        }

        for (var thread : threads) {
            try {
                thread.join();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        var result = calculators
            .stream()
            .map(c->c.getTotal())
            .reduce(Integer::sum)
            .get();
        System.out.println("Total calculators après confinement: " + result);*/

        Calculator calculator = new Calculator();
        for (int i = 0; i <5; i++) {
            Thread thread = new Thread(new Task(calculator));
            thread.start();
            threads.add(thread);
            calculators.add(calculator);
        }

        for (var thread : threads) {
            try {
                thread.join();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        calculator.displayTotal();



    }
}
