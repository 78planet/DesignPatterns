package creational_patterns.sigleton;

public class DemoMultiThread {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new ThreadFoo());
        Thread thread2 = new Thread(new ThreadBar());

        thread1.start();
        thread2.start();
    }

    static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            Singleton foo = Singleton.getInstance("Foo");
            System.out.println(foo.value);
        }
    }

    static class ThreadBar implements Runnable {
        @Override
        public void run() {
            Singleton bar = Singleton.getInstance("Bar");
            System.out.println(bar.value);
        }
    }
}
