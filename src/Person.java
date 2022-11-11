public class Person {
    String name;
    int age;

    //오버로딩
    public Person (String name) {
        this.name = name;
    }
    public Person (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println("밥 먹기.");
    }

    public void say() {
        System.out.println("말하기.");
    }

    public void info() {
        System.out.printf("이름 %s 나이 %d\n",name,age);
    }
}


class Student extends Person {
    int grade;

    //오버로딩
    public Student (String name, int grade) {
        super(name);
        this.grade = grade;
    }

    public Student (String name, int age, int grade) {
        super(name,age);
        this.grade = grade;
    }

    @Override
    public void eat() {
        System.out.println("급식 먹기.");
    }

    public void learn() {
        System.out.println("배우다.");
    }

}

class Abc {
    private int a = 12345;
    public int ab = 11111;
}