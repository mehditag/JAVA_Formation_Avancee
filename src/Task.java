public class Task implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread started"+Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread finished"+Thread.currentThread().getName());
    }
    

}
