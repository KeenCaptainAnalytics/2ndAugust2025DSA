class Person{
    String name;
    int age;
    String phone;
}

class Test{

    static Person doSomething(){
        Person p1 = new Person();
        p1 .name ="reena";
        p1.age=89;
        p1.phone ="24234234";

        return p1;
    }
    public static void main(String[] args) {
        
        Person p1 = new Person();
        Person p2 = doSomething(); 
        
        System.out.println(p1.name+" , "+p1.age+" , "+p1.phone);
        System.out.println(p2.name+" , "+p2.age+" , "+p2.phone);

    }
}