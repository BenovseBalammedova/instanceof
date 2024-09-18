public class MyThread1 extends Thread {

    private final String name;


    public MyThread1(String name) {
        this.name = name;


    }

    public void run(){
        while (true){
            System.out.println(name);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }


}
