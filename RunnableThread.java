class RunnableThread implements Runnable
{
    public static void main(String args[])
    {
       RunnableThread obj = new RunnableThread (); 
        Thread t1=new Thread(obj);
        Thread t2=new Thread(obj);
        Thread t3=new Thread(obj);
        Thread t4=new Thread(obj);
        Thread t5=new Thread(obj);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        
    }
    public void run()
    {
        System.out.println("Hello India");
    }
}