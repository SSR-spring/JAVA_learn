public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("abc", 18);
        person1.info();
        person1.eat();
        person1.say();

        System.out.println("------------");
        Student student1 = new Student("abcde", 17, 90);
        student1.eat();  // 오버라이딩
        student1.learn();
        student1.say();   // Person 클래스를 상속 받았기 때문에 Student 클래스에 say 가 정의되있지 않아도 사용가능

        System.out.println("------------");
        Abc abc = new Abc();
        //System.out.println(abc.a); //private error    Abc 클래스의 변수 a를 public 으로 변경하기 a 또한 접근가능
        System.out.println(abc.ab); //public 접근 가능
    }
}
