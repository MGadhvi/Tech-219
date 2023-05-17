package com.sparta.mg.concurrency;

public class ThreadOrder { //Shows the random nature of threads
    private static class LoopOne implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 20; i++) {
                System.out.println(Util.getThreadName() + ": " + i);
            }
        }
    }

    private static class LoopTwo implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 20; i++) {
                System.out.println(Util.getThreadName() + ": " + i);
            }
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new LoopOne());
        Thread thread2 = new Thread(new LoopTwo());
//		thread1.start();
//		thread2.start();

        try {
            thread1.start();
            thread1.join(); //join will make the second thread wait until the first has finished
            thread2.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

