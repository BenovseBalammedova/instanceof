import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {

       MyThread1 thread1=new MyThread1("salam");
       MyThread2 thread2=new MyThread2("necese");
        Thread thread=new Thread(new MyThread2("necesen"));
        thread1.start();
       thread.start();
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.submit(thread1);
        executorService.submit(thread);
        executorService.execute(()->);


//        NoThread1 noThread1=new NoThread1("Aysel");
//        NoThread2 noThread2=new NoThread2("necesen");
//        noThread2.start();
//        noThread1.start();


        sysxronzasiya
        MyPrint myPrint=new MyPrint();
            MyThreadSinxron myThreadSinxron=new MyThreadSinxron("salam",myPrint);

            Thread threadsinxron2=new Thread(new MyThreadSinxron2("necesen",myPrint));
        threadsinxron2.start();
            myThreadSinxron.start();
            threadsinxron2.start();
    }


    }
