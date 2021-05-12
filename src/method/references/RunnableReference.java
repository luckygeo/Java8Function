package method.references;

public class RunnableReference {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous");
            }
        };
        new Thread(runnable).start();
        new Thread(() -> {
            System.out.println("lambda");
        }).start();
        new Thread(Go::go).start();
    }
}
