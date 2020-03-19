package yielddemo;

public class YieldDemo {
    public static  void main(String args[]){
        System.out.println(Thread.currentThread().getPriority());
        MyThread t=new MyThread();
        t.start();
        System.out.println(t.getPriority());
        t.yield();
        for(int i=0;i<10;i++){
            System.out.println("main thread");

        }

    }
}
