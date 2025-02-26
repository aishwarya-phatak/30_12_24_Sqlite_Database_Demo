public class Person {
    private int age;
    private String name;
    private int height;
    private int aadharNumber;
    private String gender;

    //default constructor
    public Person(){
        this.age = 23;
        this.name = "Adinath";
        this.height = 5;
        this.aadharNumber = 3423;
        this.gender = "Male";
    }

    //parameterized constructor
    public Person(int age, String name, int ht, int aadharNo, String gender){
        this.age = age;
        this.name = name;
        this.height = ht;
        this.aadharNumber = aadharNo;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getAadharNumber() {
        return aadharNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setAadharNumber(int aadharNumber) {
        this.aadharNumber = aadharNumber;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

//    public void displayPersonDetails(){
//        System.out.println("Name " + name);
//    }

    public void display(){
        System.out.println("person details  " + "name : " + name + "age : "
                +  age + "aadharNumber :" + aadharNumber);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "name " + name + "age " + age;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
