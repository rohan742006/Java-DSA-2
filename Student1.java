import java.util.*;

public class Student1 {
    public static void main(String args[]) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("Rohan", 25));
        list.add(new Person("Aman", 18));
        list.add(new Person("Ankur", 28));

        Collections.sort(list); // sorts by age using compareTo(),but got confused in getting criteria of comparison , moves  to implemented

        System.out.println(list);
    }
}

class Person implements Comparable<Person> {  //implements Comparable which contains compareto method but without body
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override  //overridng that compareto method which don't have body
    public int compareTo(Person person) {  //declaring out own method with body (overridng)
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
