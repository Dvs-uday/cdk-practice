import java.util.*;

public class Threadtest2 extends Thread{

    public Threadtest2(String threadname)
    {
        super(threadname);
    }
    @Override
    public void run(){
        for(int i=0;i<5;i++)
        {
            System.out.println("Inside "+ Thread.currentThread().getName()+" "+i);
        }

    }
    
}
