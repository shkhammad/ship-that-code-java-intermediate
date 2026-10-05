package solutions._11_threads;

import java.util.concurrent.atomic.AtomicInteger;

class Main {
    public static void main(String[] args) throws InterruptedException {
        AtomicInteger counter = new AtomicInteger(0);
        Thread[] threads = new Thread[4];
        for (int i = 0; i < 4; i++) {
            threads[i] = new Thread(() -> {
                for(int j=0;j<250;++j)
                    counter.incrementAndGet();
            });
            threads[i].start();
        }

        for (Thread t : threads) t.join();
        System.out.println(counter.get());
    }
}