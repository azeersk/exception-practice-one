import java.io.*;
import java.util.*;

class TestOne implements Runnable
{
    public void run()
    {

        System.out.println("In Test Thread");

    }
}

public class multiThreadTwo {

    public static void main (String[] args)throws InterruptedException {

        Thread t = new Thread(new TestOne());

        t.start();

        System.out.println("In Main Thread");
    }
}
