public class DisplayMessega implements Runnable {
    private String message;

    public DisplayMessega(String message) {
        this.message = message;
    }

    @Override
    public void run() {
while (true){
    System.out.println(message);

    return;
}

    }
}
