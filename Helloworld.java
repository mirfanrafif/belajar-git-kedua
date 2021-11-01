/**
 * Helloworld
 */
public class Helloworld {

    public static void main(String[] args) {
        System.out.println("Hello world");
        try {
            while (true) {
                System.out.println("Hello world forever");
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}