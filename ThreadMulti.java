public class ThreadMulti {
    public static void main(String[]args) throws Exception {
        A obj = new A();
        B obj1 = new B();

        obj.setPriority(Thread.MAX_PRIORITY);
        System.out.println(obj.getPriority());

        obj.setName(" A Thread");
        obj1.setName(" B Thread");

        obj.start();
        Thread.sleep(500);
        obj1.start();
    }
}
class A extends Thread {
    public void show(){
        for (int count = 1; count <= 5; count++){
            System.out.println("Hello" + getName());
            try{Thread.sleep(1000);} catch (Exception e){}
        }
    }
    public void run(){
        show();
    }
}
class B extends Thread {
    public void show(){
        for (int count = 1; count<=5; count++){
            System.out.println("Nigerians" + getName());
            try{Thread.sleep(1000);} catch (Exception e){} 
        }
    }
    public void run(){
        show();
    }
}
