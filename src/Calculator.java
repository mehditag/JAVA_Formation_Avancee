import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Calculator {
    private int total = 0;
    private Lock lock= new ReentrantLock();
    
    public void increment(){
        lock.lock();
        try {
            total++;
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        finally{
            lock.unlock();
        }
    }

    

    public void displayTotal(){System.out.println(this.total);}



    public int getTotal() {
        return total;
    }



    public void setTotal(int total) {
        this.total = total;
    }

}
