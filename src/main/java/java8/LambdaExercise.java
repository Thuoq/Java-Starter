package java8;

interface Greeter {
    void greet();

}
public class LambdaExercise {
    // main
    public static void main(String[] args) {
        wish(() -> {
            System.out.println("Good morning!");
        });
    }
    public static void wish(Greeter greeter) {
        greeter.greet();
    }
}
