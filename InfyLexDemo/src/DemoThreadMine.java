public class DemoThreadMine {
    public static void main(String pars[]) {
        Thread threadInstance = new Thread(() ->System.out.println("It's me from Thread"));
        
        threadInstance.start();
    }
}