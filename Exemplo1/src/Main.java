public class Main {
    public static void main(String[] args) {

        // Extended
        ThreadExtended t = new ThreadExtended();
        t.start();

        // Runnable
        ThreadRunnable t2 = new ThreadRunnable();
        Thread tr = new Thread(t2);
        tr.start();

    }
}