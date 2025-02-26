public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        MathsOperations m1 = new MathsOperations();
        int res1 = m1.add(12,345);
        m1.add();

        System.out.println("------- res is :" + res1);

        MathsOperations m2 = new MathsOperations(12,34);

        Person p1 = new Person();
        Person p2 = new Person(24,"Tanuja",5,342322,"Female");

        System.out.println("hash code of p1 " + p1.hashCode());
        System.out.println("hash code of p2 " + p2.hashCode());

        System.out.println(p1.equals(p2));

        p1.setAge(25);
        System.out.println("p1 is " + p1.toString());

        Employee e = new Employee();
        e.display();
    }


}