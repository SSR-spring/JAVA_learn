public class Person {
    private String name;
    private int age;


    public Person(String name) {   //오버로딩
        this.name = name;
    }
    public Person(String name,int age) {   //오버로딩
        this.name = name;
        this.age = age;
    }

    public void intro() {   //오버로딩
        System.out.println("사람입니다");
    }

    public void intro(String name) {   //오버로딩
        System.out.println("사람 " + name );
    }

    public void intro(String name, int age) {   //오버로딩
        System.out.println("사오 " + name + "나이 " + age);
    }


}

class Student extends Person {
    private String name;
    private int age;

    public Student(String name) {  //오버로딩
        super(name);
    }

    public Student(String name, int age) {  //오버로딩
        super(name,age);
    }

    @Override
    public void intro() {   //오버라이딩 14번째 Person클래스의 intro를 오버라이딩해 Student클래스에 맞게 재정의
        System.out.println("학생입니다.");
    }

}