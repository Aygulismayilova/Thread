public class Util {
    private static Object monitor1 = new Object();
    private static Object monitor2 = new Object();

    public void foo() throws InterruptedException {
        System.out.println(" foo 1: Salam burada gozlemeye ehtiyac yoxdu");// tutaq ki 10 saniye is gorur
        synchronized (monitor1) {
            Thread.sleep(2000);
            System.out.println(" foo 1: Burada bir birinizi gozlemelisiz");//1 saniye is gorur
        }
        System.out.println(" foo 1: burada ise gozlemeye ehtiyac yoxdur");// tutaq ki 20 saniye is gorur


    }

    public void foo2() {
        synchronized (Util.class) {
            System.out.println(" foo2: Salam burada gozlemeye ehtiyac yoxdu");// tutaq ki 10 saniye is gorur
        }
        synchronized (monitor2) {
            System.out.println(" foo2: Burada bir birinizi gozlemelisiz");//1 saniye is gorur
        }
        System.out.println(" foo2: burada ise gozlemeye ehtiyac yoxdur");// tutaq ki 20 saniye is gorur


    }
    public void foo3() throws InterruptedException {
        System.out.println(" foo 1: Salam burada gozlemeye ehtiyac yoxdu");// tutaq ki 10 saniye is gorur
        synchronized (monitor1) {
            Thread.sleep(2000);
            System.out.println(" foo 1: Burada bir birinizi gozlemelisiz");//1 saniye is gorur
        }
        System.out.println(" foo 1: burada ise gozlemeye ehtiyac yoxdur");// tutaq ki 20 saniye is gorur


    }
}
