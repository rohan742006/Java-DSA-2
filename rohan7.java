import java.util.*;
public class rohan7{
    static class Student implements Comparable<Student>{
        String name;
        int age;

        Student(String n,int a){
            this.name=n;
            this.age=a;
        }

        @Override
        public int compareTo(Student s){
            return this.name.compareTo(s.name);
        }
    }

    public static void main(String args[]){
        PriorityQueue<Student>pq=new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(new Student("Rohan",19));
        pq.add(new Student("Pranavi",20));
        pq.add(new Student("vishal",25));

        while(!pq.isEmpty()){
            System.out.print(pq.peek().name+"-->"+pq.peek().age+" ");
            pq.remove();
        }
    }
}