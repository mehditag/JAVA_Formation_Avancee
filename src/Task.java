public class Task implements Runnable{
    private Calculator calculator;
    
    public Task(Calculator calculator) {
        this.calculator=calculator;
    }

        

    @Override
    public void run() {

        System.out.println("Thread started"+Thread.currentThread().getName());
        for(int i=0;i<5000;i++){
            if (Thread.currentThread().isInterrupted())
                break;
            calculator.increment();
        }

        System.out.println("Thread finished"+Thread.currentThread().getName());
    }
    

}
