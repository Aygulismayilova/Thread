public class MyRunnable2 implements Runnable {


    public Object monitor;

    public MyRunnable2(Object monitor) {
        this.monitor = monitor;
    }

    @Override
    public void run() {
        System.out.println("t2 run");
        try {
            synchronized (monitor) {
                monitor.notify();
                System.out.println("t2 notify");
                monitor.wait();
                System.out.println("t2 wait");
                System.out.println("t2 end");

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // monitor.notify();
        //   Main.util.foo2();

    }

      /*  while (Main.getI()<10){
            System.out.println("yehuu");
        }*/
}

