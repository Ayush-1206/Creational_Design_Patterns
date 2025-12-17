package Singleton_Pattern;


public class Singleton {
    private static Singleton singletonObj = null;

    private Singleton(){
        System.out.println("Singleton constructor called");
    }

    public static Singleton getInstance(){
        if(singletonObj == null){
            singletonObj = new Singleton();
        }
        System.out.println("instance created");
        return singletonObj;
    }

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(s1 == s2);
    }
}
