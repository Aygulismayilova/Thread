public class RunnableDemo implements Runnable {

    private Thread t;
    private String threadName;

    public RunnableDemo(String name) {
        this.threadName = name;
        System.out.println("creating " + threadName+" with the constructor");
    }

    @Override
    public void run() {
        System.out.println("running " + threadName);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("thread: " + threadName +" " +i);
//let thread sleep for 50 millis
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            System.out.println("thread " + threadName + "interrupted.");
        }
        System.out.println("thread " + threadName + "exited.");

    }

    public void start() {
        System.out.println("Starting" + threadName);
        if (t==null){
            t=new Thread(this,threadName);
            t.start();
        }

    }
}



