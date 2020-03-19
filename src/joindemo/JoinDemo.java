package joindemo;

public class JoinDemo {
    public static void main(String []args) throws InterruptedException{
        MyThread t=new MyThread();
        System.out.println(Thread.currentThread().isDaemon());
     //   Thread.currentThread().setDaemon(true);//here you will get java.lang.IllegalThreadStateException beacause main thread already start by jvm so you cannot set main thread as daemon.
      t.setDaemon(true);
        t.start();
        t.join();
        System.out.println(t.isDaemon()+"child thread ");

        for(int i=0;i<10;i++){
            System.out.println("main thread");
        }


    }
}
