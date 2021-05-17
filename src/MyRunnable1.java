public class MyRunnable1 implements Runnable {
    public Object monitor;

    public MyRunnable1(Object monitor) {
        this.monitor = monitor;
    }


    @Override
    public void run() {
        try {
            System.out.println("t1 run");
            synchronized (monitor) {
                System.out.println("t1 begin");
                monitor.wait();
                System.out.println("t1 wait");
                monitor.notify();
                Thread.sleep(4000);
                System.out.println("t1 notify");
                System.out.println("t1 end ");
                //Main.util.foo2();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }






       /* try {
            Main.util.foo();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/


      /*  for (int i = 0; i < 10000; i++) {
           Main.increaseI();
        }*/
    }

}
