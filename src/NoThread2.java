public class NoThread2 {
private String name;

    public NoThread2(String name) {
        this.name = name;
    }


    public void run() throws InterruptedException {
        while (true) {
            System.out.println(name);
            Thread.sleep(1000);
        }

    }
    public void start() throws InterruptedException {
        run();
    }

}
