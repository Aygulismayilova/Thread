public class Main {


    public static Util util = new Util();

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new MyRunnable1(util));
        t1.start();

        Thread t2 = new Thread(new MyRunnable2(util));
        t2.start();






     /*   new Thread(new MyRunnable1()).start();
        new Thread(new MyRunnable2()).start();
    */
    }


}




 /* private volatile static int i=0;

  public synchronized static void increaseI(){
      i++;
  }
  public static int getI(){
      return i;
  }
    static int[] arr = new int[200];
    static int portion = 30;

    public static void main(String[] args) throws InterruptedException {
       new Thread(new MyRunnable1()).start();
        new Thread(new MyRunnable1()).start();
        new Thread(new MyRunnable1()).start();
        new Thread(new MyRunnable1()).start();
        Thread.sleep(3000);
         System.out.println(getI());

*/
    /*    for (int i = 0; i < 200; i++) {
            arr[i] = i;
        }
        for (int i = 0; i < 200; i += portion) {
            int begin =i;
            int end = i + portion;
            if (end >= 2) end = 199;
            Thread thread1 = new Thread(new MyGeneralRunnable( arr, begin, end));
            thread1.start();
        }*/










        /*
GuessNumber number=new GuessNumber(98);
number.run();
number.start();
*/


// DisplayMessega messeage=new DisplayMessega("maraqli thread");
//  messeage.run();
//  System.out.println("Thread.currentThread().getName()"+Thread.currentThread().getName());
//      System.out.println("active " + Thread.activeCount());
/*

        MyThread2 thread2 = new MyThread2();
        MyThread3 thread3 = new MyThread3();
        MyThread4 thread4 = new MyThread4();
        MyThread5 thread5 = new MyThread5();
        // System.out.println(thread1.getThreadGroup());
        thread2.start();
        Thread thread1 = new Thread(new MyRunnable());
        thread1.start();
        */
/*for(int i=0;i<111;i++){
            System.out.print(i);
        }*//*

        System.out.println("active " + Thread.activeCount());
*/


      /*  RunnableDemo r1 = new RunnableDemo("Thread-1");
        RunnableDemo r2 = new RunnableDemo("Thread-2");
        r1.start();*/
//  r2.start();
// write your code here
//        System.out.println(Thread.activeCount());
//        MyRunnable thread1 = new MyRunnable();
//        MyThread2 thread2 = new MyThread2();
//        thread1.start();
//        thread2.start();
//        System.out.println("active "+Thread.activeCount());
/*
}

class MyRunnable implements Runnable {
    @Override
    public void run() {

    }*/
  /*  @Override
    public void run() {
        try {
            System.out.println("ikinci threadi gozleyirem");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
// System.out.println("hello 1 " + new Date().getTime() + " " + this.getClass().getName());


//  }
/*}

class MyThread2 extends Thread {*/
   /* @Override
    public void run() {
    //    for (int i = 0; i < 30; i++) {
            System.out.println("hello 2 " + new Date().getTime());
        //}


    }*/
/*}

class MyThread3 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            System.out.println("hello 3 " + new Date().getTime());
        }


    }
}

class MyThread4 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            System.out.println("hello 4 " + new Date().getTime());
        }


    }
}

class MyThread5 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            System.out.println("hello 5 " + new Date().getTime());
        }


    }*/
