import java.util.Date;

public class MyThreadGeneral extends Thread {
    private int arr[];

    public MyThreadGeneral(int[] arr) {
        this.arr = arr;
    }
    @Override
    public void run(){
        System.out.println("hello , "+new Date().getTime());
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
