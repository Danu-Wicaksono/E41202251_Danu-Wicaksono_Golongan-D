class Person{
    public String name;
    public int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public int getAge() {
        return this.age;
    }
    public String getName(){
        return this.name;
    }
}
class managingpeople {
    public static void main(String[] args) {
        Person p1 = new Person("Arial", 37);
        Person p2 = new Person("Joseph", 15);

        if (p1.getAge()==p2.getAge()) {
            System.out.println(p1.getName() + " is the same age as " + p2.getName());
        } else {

            System.out.println(p1.getName() + " is NOT the same age as " + p2.getName());
        }

    }
}