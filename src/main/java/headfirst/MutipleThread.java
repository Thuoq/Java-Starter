package headfirst;

public class MutipleThread {
    public static void main(String[] args) {
        MyTask task1 = new MyTask(10, "A");
        MyTask task2 = new MyTask(10, "B");

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        thread1.start();
        thread2.start();

    }
}
class MyTask implements Runnable {
    private int times;
    private String name;
    MyTask(int times, String name) {
        this.times = times;
        this.name = name;
    }
    @Override
    public void run() {
        for (int i = 0; i < times; i++) {
            System.out.println("Task " + name + " is running");
        }
    }
}
