class MultithreadDemo extends Thread
{
    public static void main(String args[])
    {
        Thread t1=new MultithreadDemo();
        Thread t2=new MultithreadDemo();
        Thread t3=new MultithreadDemo();
        Thread t4=new MultithreadDemo();
        Thread t5=new MultithreadDemo();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
       // System.out.println("Hello All : "+ Thread.currentThread().getName()+" "+System.currentTimeMillis());
        
    }
    public void run()
    {
        System.out.println("Hello All : "+ Thread.currentThread().getName()+" "+System.currentTimeMillis());
    }
}