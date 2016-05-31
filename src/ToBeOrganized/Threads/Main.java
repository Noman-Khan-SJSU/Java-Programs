package ToBeOrganized.Threads;

class Main {

    public static void main(String[] args) {

        Thread t1 = new Thread(new Dhaaga("one"));              // Dhaaga class has to implement Runnable interface for this to work.
        Thread t2 = new Thread(new Dhaaga("two"));
        Thread t3 = new Thread(new Dhaaga("three"));
        Thread t4 = new Thread(new Dhaaga("four"));

        t1.start();                                             // start() method just calls the run() method in the thread class (Dhaaga) which implemented Runnable interface.
        t2.start();                                             // All of these threads will start at the same time.
        t3.start();
        t4.start();

    }

}