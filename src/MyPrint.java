public class MyPrint {

    private String name;
    public synchronized void myprint(String name) throws InterruptedException {
    this.name=name;
        for (int i = 0; i <5 ; i++) {
            System.out.println(name+Thread.currentThread().getName());
            Thread.sleep(1000);
        }
        System.out.println("sinxron isledi"+Thread.currentThread().getName());
       synchronized (this){
           Thread.sleep(3000);
           System.out.println("BLOKDAN CIXDIM"+Thread.currentThread().getName());

       }
    }
    public synchronized void myprint2(String name) throws InterruptedException {
        this.name=name;
        for (int i = 0; i <5 ; i++) {
            System.out.println(name+Thread.currentThread().getName());
            Thread.sleep(1000);
        }
        System.out.println("sinxron isledi"+Thread.currentThread().getName());
        synchronized (name){
            Thread.sleep(3000);
            System.out.println("BLOKDAN CIXDIM"+Thread.currentThread().getName());

        }

}}
