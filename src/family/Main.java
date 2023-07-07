package family;

public class Main {
    public static void main(String[] args) {
        Person leonid = new Person("Леонид", "Петров", 79, null, null);
        Person elena = new Person("Елена", "Петрова", 78, null, null);
        Person boris = new Person("Борис", "Иванов", 79, null, null);
        Person luda = new Person("Людмила", "Иванова", 78, null, null);
        Person ivan = new Person("Иван", "Иванов", 45, luda, boris);
        Person natasha = new Person("Наталья", "Иванова", 43, elena, leonid);
        Person andrey = new Person("Андрей", "Иванов", 17, natasha, ivan);

        andrey.getInfo();
        System.out.println();
        natasha.getInfo();
        System.out.println();
        ivan.getInfo();
        System.out.println();
        luda.getInfo();
        System.out.println();
        boris.getInfo();
        System.out.println();
        elena.getInfo();
        System.out.println();
        leonid.getInfo();
    }
}
