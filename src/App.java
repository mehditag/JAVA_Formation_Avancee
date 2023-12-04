public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(Thread.activeCount());
        System.out.println(Runtime.getRuntime().availableProcessors());

        //Démarrage d'un Thread
        System.out.println("######### Démarrage d'un Thread ########");
        System.out.println(Thread.currentThread().getName());
        /*for (int i=0; i<5; i++){
            Thread thread = new Thread(() -> System.out.println(Thread.currentThread().getName()));
            thread.start();
        }*/


        //Mise en pause d'un Thread
        System.out.println("######### Mise en pause d'un Thread ###########");
        for (int i=0; i<5; i++){
            Thread thread = new Thread(new Task();
            thread.start();
        }
    }
}
