import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main (String[] args) {

        User u = new User("Alex", 37);
        System.out.println(u.getAge());

        List<Integer> ints = List.of(1, -2, 35, 47, 10, -300);
        List<Integer> i = new ArrayList<>();
        i.addAll(ints);
        System.out.println(i);
        Collections.sort(i);
        System.out.println(i);

    }
}


class User {
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


}

