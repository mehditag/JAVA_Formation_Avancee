public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(Thread.activeCount());
        System.out.println(Runtime.getRuntime().availableProcessors());

        //Démarrage d'un Thread
        System.out.println("######### Démarrage d'un Thread ########");
        System.out.println(Thread.currentThread().getName());
        for (int i=0; i<5; i++){
            Thread thread = new Thread(() -> System.out.println(Thread.currentThread().getName()));
            thread.start();
        }


        //Mise en pause d'un Thread
        System.out.println("######### Mise en pause d'un Thread ###########");
        System.out.println("Thread started"+Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread finished"+Thread.currentThread().getName());
    }
}
