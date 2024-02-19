class Thread1 extends Thread {
    private int total = 0;

    public synchronized void sub() {
        try {
            wait(1000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Subtracted block");
    }

    public synchronized void sum() {
        sub();
        for (int i = 0; i < 5; i++) {
            total += i;
        }
        System.out.println("Total is " + total);
        notifyAll(); // Notify waiting threads after calculation
    }

    public void run() {
        sum();
    }
}

public class Interthread {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        t1.start();

        synchronized (t1) {
            try {
                t1.wait(); // Main thread waits for t1 to finish its calculation
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // This part will execute after t1 finishes its calculation
        System.out.println("Main thread continues...");
    }
}
