class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello from MyRunnable: " + i);
            try {
                Thread.sleep(1000); // Pause for 1 second
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
            //we use sleep method here so that we can run both threads simultaneously -1sec 1sec gap
        }
    }
}

public class Threadrunnable{
    public static void main(String[] args) {
        System.out.println("Main thread starting.");

        //Instance of MyRunnable
        MyRunnable myRunnable = new MyRunnable();

        //Thread using the MyRunnable instance
        Thread myThread = new Thread(myRunnable);

        //Start the thread
        myThread.start();

        // Main thread continues executing
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello from main: " + i);
            try {
                Thread.sleep(1000); // Pause for 1 second
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted");
            }
        }

        System.out.println("Main thread exiting.");
    }
}
