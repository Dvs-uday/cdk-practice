//executing by extending the class

import java.util.*;

public class Threadtest1{
    public static void main(String[] args) {
       Thread t1=new Threadtest2("Threadname1");
       System.out.println("Code in main thread");
       t1.start();// we call start because we need to run thread simultaneously

       System.out.println("Main is exiting");
    
}
}
