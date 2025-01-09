
class Counter{
    int counter;

    public void increment(){
        counter++;
    }
}

public class Race{
    public static void main(String[] args) throws InterruptedException{
        Counter c = new Counter();

        Runnable obj1 = () ->{
            for (int i =1; i<1000; i++){
                c.increment();
            }
        };

        Runnable obj2 = () ->{
            for (int i =1; i<1000; i++){
                c.increment();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
        
        t1.join();
        t2.join();

        System.out.println(c.counter);
    }
}

//************************************************************************************ 

// class A extends Thread{
//     @Override
//     public void run(){
//         for (int i=0; i<100; i++){
//             System.out.println("atharva");
//             try {
//                 Thread.sleep(2);
//             } catch (InterruptedException ex) {
//                 ex.getStackTrace();
//             }
//         }
//     }
// }

// class B extends Thread{
//     @Override
//     public void run(){
//         for (int i=0; i<100; i++){
//             System.out.println("desai");
//             try {
//                 Thread.sleep(2);
//             } catch (InterruptedException ex) {
//                 ex.getStackTrace();
//             }
//         }
//     }
// }

// public class Race{
//     public static void main(String[] args) {
//         A obj1 = new A();
//         B ojb2 = new B();

//         obj1.start();
//         ojb2.start();
//     }
// }

//***************************************************************************** 