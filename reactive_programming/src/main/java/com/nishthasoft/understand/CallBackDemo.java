package com.nishthasoft.understand;

/*

We have a interface that having single method call, that we will use to signal the completion  of any process running
on a separate thread than main thread

 */
public class CallBackDemo {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread is running...");



        Runnable r = new Runnable() {
            @Override
            public void run() {
                new CallBackDemo().runningAsync(new CallBack() {

                    @Override
                    public void pushData(String data) {
                        System.out.println("callBack " + data);
                    }

                    @Override
                    public void pushComplete() {
                        System.out.println("CallBack done !");

                    }

                    @Override
                    public void pushError(Exception e) {
                        System.out.println("CallBack Error called, Got  an exception "+ e);

                    }
                });

            }
        };

        Thread t = new Thread(r);
        t.start();
        Thread.sleep(2000);

        System.out.println("Main thread completed");




    }

    public void runningAsync(CallBack callBack){
        System.out.println(" I am running in seperate thread");
        sleep(1000);
        callBack.pushData("Data1");
        callBack.pushData("Data2");
        callBack.pushData("Data3");

        callBack.pushError(new RuntimeException("Ooops!"));
        callBack.pushComplete();

    }

    private void sleep(int duration) {
        try {
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
