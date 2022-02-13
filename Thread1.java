import java.util.*;

public class Thread1
{
    public static void main(String[] args) {
        Mlt1 obj1 = new Mlt1();
        Mlt2 obj2 = new Mlt2();
        Mlt3 obj3 = new Mlt3();
        Mlt4 obj4 = new Mlt4();
        Thread trd = new Thread(obj4);
        obj3.start();
        obj1.start();
        obj2.start();
        trd.start();
    }
}
class Mlt1 extends Thread{
    public void run(){
    int i =  0;
    while(i!=5000){
        System.out.println("this thread");
    }
    }
}
    
class Mlt2 extends Thread{
    public void run(){
    int i =  5000;
    while(i!=0){
        // System.out.println("this thread is awesome");
        System.out.println(i--);
    }
    }
}
class Mlt3 extends Thread{
    public void run(){
    int i =  0;
    while(i!=5000){
        // System.out.println("this thread is awesome not only awesom fucking osm");
        System.out.println(i++);
    }
    }
    
}
class Mlt4 implements Runnable{
    public void run(){
    int i =  0;
    while(i!=5000){
        System.out.println("this thread is awesome not only awesom fucking osm 536464498");
    }
    }
}
