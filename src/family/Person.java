package family;

public class Person {
    private String name;
    private String lastname;
    private int age;
    private Person mother;
    private Person father;

    public Person(String name, String lastname, int age, Person mother, Person father) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.mother = mother;
        this.father = father;
    }

    public void getInfo() {
        String result = "Имя      :  " + this.name + "\n" +
                "Фамилия  :  " + this.lastname + "\n" +
                "Возраст  :  " + this.age + "\n";
        if (this.mother != null) {
            result += "Имя мамы :  " + this.mother.name + "\n";
            if (this.father != null) {
                result += "Имя папы :  " + this.father.name + "\n";
                if (this.mother.mother != null) {
                    result += "Имя бабушки 1 по маминой линии: " + this.mother.mother.name + "\n";
                    if (this.father.father != null) {
                        result += "Имя дедушки 1 по маминой линии: " + this.mother.father.name + "\n";
                        if (this.mother.mother != null) {
                            result += "Имя бабушки 2 по папиной линии: " + this.father.mother.name + "\n";
                            if (this.father.father != null) {
                                result += "Имя дедушки 2 по папиной линии: " + this.father.father.name + "\n";
                            }
                        }
                    }
                }
            }
        }
        System.out.println(result);
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public Person getMother() {
        return mother;
    }

    public Person getFather() {
        return father;
    }
}
