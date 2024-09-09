//write a java program that create two threads  1 thread should print numbers from 1 to 5
// and other thread should print letters  a b c d e f insures that  the output shows enterleaved execution of both threads

public class InterleavedThreads {
    private static Object lock = new Object();
    private static boolean printNumber = true;

    public static void main(String[] args) {
        Thread numberThread = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                synchronized (lock) {
                    while (!printNumber) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.print(i + " ");
                    printNumber = false;
                    lock.notifyAll();
                }
            }
        });

        Thread letterThread = new Thread(() -> {
            for (char c = 'A'; c <= 'E'; c++) {
                synchronized (lock) {
                    while (printNumber) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.print(c + " ");
                    printNumber = true;
                    lock.notifyAll();
                }
            }
        });

        numberThread.start();
        letterThread.start();
    }
}