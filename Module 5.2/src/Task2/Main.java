package Task2;

public class Main {
    public static void main(String[] args) {
        ThreadSafeList safeList = new ThreadSafeList();

        Thread addThread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                safeList.add("Item-" + i);
                System.out.println("Added Item-" + i + ", Size: " + safeList.getSize());
            }
        });

        Thread addThread2 = new Thread(() -> {
            for (int i = 5; i < 10; i++) {
                safeList.add("Item-" + i);
                System.out.println("Added Item-" + i + ", Size: " + safeList.getSize());
            }
        });

        addThread1.start();
        addThread2.start();

        try {
            addThread1.join();
            addThread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nFinal size: " + safeList.getSize());
    }
}