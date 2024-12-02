package core.basesyntax;

import core.basesyntax.Model.Cat;
import core.basesyntax.Model.Dog;

import java.time.LocalDate;

public class Hello_World {
    private String a;
    private int nameVariable;
    private int age, size;

    public static void main(String[] args) {
        System.out.println("Hello world");
    }

    private void sayHello(String HELLO) {
        System.out.println("Hello, Mate! I am happy to see you! This class looks weird! Your task is to fix the checkstyle in this file." +
                " Your goal is to run `mvn clean package` and receive `BUILD SUCCESS` message");
        System.out.println(HELLO);
    }

    private void initializeVariables() {
        a = "Hello mates!";
        System.out.println(a);
        nameVariable = LocalDate.now().getYear();
        System.out.println("It is " + nameVariable + "year");
        age = 25;
        System.out.println("I'm " + age);
        size = 42;
        System.out.println("The size is " + size);
    }
}
