import java.util.Date;

public class MyGeneralRunnable implements Runnable {

    private int arr[];
    private int begin;
    private int end;
    private String name;

    public MyGeneralRunnable(int[] arr,int begin,int end) {
        this.arr = arr;
        this.begin=begin;
        this.end=end;
        this.name=name;
    }

    @Override
    public void run() {
        System.out.println("hello 1, " + new Date().getTime());
        for (int i = begin; i <= end; i++) {
            System.out.println(Thread.currentThread().getName()+","+arr[i]);
        }
    }
}
