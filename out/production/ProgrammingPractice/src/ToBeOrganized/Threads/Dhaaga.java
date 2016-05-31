// Two or more tasks can be performed at the same time using thread.
// E.g. Youtube video gets played and buffered at the same time.

package ToBeOrganized.Threads;

import java.util.Random;

class Dhaaga implements Runnable {                  // Runnable interface just have one abstract method, run().

    String name;
    int time;
    Random r = new Random();

    public Dhaaga (String x) {

        name = x;
        time = r.nextInt(999);
    }

    public void run() {                             // Whenever the thread starts, run method gets executed.

        try {
            System.out.printf("%s is sleeping for %d ms\n", name, time);
            Thread.sleep(time);
            System.out.println(name + " has just woke up!");
        } catch (Exception e) {}
    }

}