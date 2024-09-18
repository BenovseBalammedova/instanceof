public class MyThreadSinxron2 implements Runnable{
    private String name;
    private MyPrint print;

    public MyThreadSinxron2(String name, MyPrint print) {
        this.name = name;
        this.print = print;
    }
    public void run()  {
        try {
            print.myprint2(name);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    }

