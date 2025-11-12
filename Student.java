import java.util.*;

public class Student {
    public static void main(String args[]) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("Rohan", 25));
        list.add(new Person("Aman", 18));
        list.add(new Person("Ankur", 28));

        Collections.sort(list); // sorts by age using compareTo()

        System.out.println(list);
    }
}

class Person implements Comparable<Person> {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person person) {
        if (this.age == person.age)
            return 0;
        else if (this.age < person.age)
            return -1;
        else
            return 1;
    }

    @Override
    public String toString() {
        return this.name + ":" + this.age;
    }
}
