public class VariableDemo {

    int instancevar = 5;

    static String statVar = "I am static";

    final String finalVar = "I am final";

    public void show() {

        int localVar = 8;

        System.out.println("local variable: " + localVar);
        System.out.println("final var : " + finalVar);
        System.out.println("instance Variable:  " + instancevar);

    }

}
