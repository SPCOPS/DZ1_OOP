public class DZ1_OOP {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик", 3);

        Owner owner1 = new Owner("Иван");
        cat1.setOwner(owner1.getName());
        cat1.greet(); 

        cat1.setName("Мурзик");
        cat1.setAge(5);
        cat1.setOwner("Анна");
        cat1.greet();
    }
}

class Cat {
    private String name;
    private int age;
    private String owner;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void greet() {
            System.out.println("Мяу! Меня зовут " + name + ". Мне " + age + " года (лет). Мой владелец - " + owner + ".");
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}

class Owner {
    private String name;

    public Owner(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}