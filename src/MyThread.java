public class MyThread extends Thread {
    private Thread t;
    private String threadName;

    MyThread(String name) {
        this.threadName = name;
        System.out.println("Creating " + threadName);
    }

    @Override
    public void run() {
        System.out.println("Thread "+threadName+" running ");
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println(Thread.currentThread()+" "+i);

                Thread.sleep(400);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted");

        }
        System.out.println("Thread " + threadName + "exiting");
    }
    public void start(){
        System.out.println("Starting "+ threadName);
        if (t==null){
            t=new Thread(this,threadName);
            t.start();
        }
    }
}

