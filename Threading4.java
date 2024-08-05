public class Threading4 {
    public static void main(String []a) throws Exception
    {

        Thread t1 = new Thread(new Runnable(){
            public void run(){
                for (int i = 1; i<=5; i++){
                    System.out.println("Hello");
                    try {Thread.sleep(1000);} catch (Exception e){System.out.println();}
                }
            }

        });
        t1.start();

        Thread t2 = new Thread(new Runnable(){
            public void run() {
                for (int i = 1; i<=5; i++) {
                    System.out.println("Bloody Nigerian");
                    try {
                        Thread.sleep(1000);
                    }
                    catch (Exception e) {
                        System.out.println();
                    }
            }   }
        });
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Done");
    }
}


