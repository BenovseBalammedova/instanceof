public class MyThreadSinxron extends Thread{
    private String name;
    private MyPrint print;
    public MyThreadSinxron(String name, MyPrint print){
        this.name=name;
        this.print=print;
    }
    public void run(){
        try {
            print.myprint(name);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    }

