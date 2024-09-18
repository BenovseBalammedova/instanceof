public class MyThread2 implements Runnable{
    private String name;


    public MyThread2(String name) {
        this.name = name;
    }

    @Override
    public void run() {
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
