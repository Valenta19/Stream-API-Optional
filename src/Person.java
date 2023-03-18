public class Person {
    private int age;


    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }

    public Person(int age) {
        this.age = age;

    }
}
