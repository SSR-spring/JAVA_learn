public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("자바");  // Person.java 6 ~ 8 번째 줄
        person1.intro();
        person1.intro("abc");
        person1.intro("abcde",10);



        Person person2 = new Person("JPA",123);  // Person.java 9 ~ 12 번째 줄
        person2.intro();



        Student student1 = new Student("스프링");  // Person.java 33 ~ 35 번째 줄
        student1.intro();


        Student student2 = new Student("JAVA",12312312);  // Person.java 37 ~ 39 번째 줄
        student2.intro();

    }
}