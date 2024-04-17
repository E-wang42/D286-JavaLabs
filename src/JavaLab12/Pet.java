package JavaLab12;

public class Pet {
    String name;
    String type;
    int age;

    Pet() {
        this.name = "unknown";
        this.type = "unknown";
        this.age = 0;
    }

    Pet(String name, String type, int age) {
        this.setName(name);
        this.setType(type);
        this.setAge(age);
    }

    void setName(String name) {
        this.name = name;
    }

    void setType(String type) {
        this.type = type;
    }

    void setAge(int age) {
        this.age = age;
    }

    String getName() {
        return name;
    }

    String getType() {
        return type;
    }

    int getAge() {
        return age;
    }


}
