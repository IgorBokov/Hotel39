import java.util.Arrays;
import java.util.Scanner;

public class Hotel {
    private Room[] rooms;

    public Hotel(Room[] rooms) {
        this.rooms = rooms;
    }

    public void getFreeRooms() {
        for (Room room : rooms) {
            if (!room.isReserved()) {
                System.out.print(room.getNumber() + ", ");
            }
        }
    }

    public void reserve(int num) {
        for (Room room : rooms) {
            if (num == room.getNumber()) {
                if (room.isReserved()) System.out.println("Комната уже забронирована другим посетителем");
                else {
                    System.out.println("Комната успешно забронирована");
                    room.setReserved(true);
                }
            }
        }
    }

    public void getFreeRoomsFilter() {
        /*
         * Спрашиваете какие характеристики комнаты нужны
         * И выводите те комнаты, которые подходят под выборку
         * */
        System.out.println("""
                   Введите данные начиная с первого пункта
                1. Указать количество спальных мест от 1 до 4
                2. Наличие кондиционера.
                3. Наличие туалета.
                4. Наличие телевизора.
                """);
        Integer[] selectOptions = new Integer[4];
        Scanner scanner = new Scanner(System.in);
        int num = correctNum();

        while (num != 1) {
            System.out.println("Введите данные начиная с первого пункта");
            num = correctNum();
        }
        switch (num) {
            case 1:
                System.out.println("Укажите количество спальных мест от 1 до 4");
                selectOptions[0] = correctNum();
            case 2:
                System.out.println("Наличие кондиционера 1 - да , 0 - нет.");
                selectOptions[1] = correctNum();
            case 3:
                System.out.println("Наличие туалета 1 - да , 0 - нет.");
                selectOptions[2] = correctNum();
            case 4:
                System.out.println("Наличие телевизора 1 - да , 0 - нет.");
                selectOptions[3] = correctNum();
        }
        System.out.println("Ваш выбор " + Arrays.toString(selectOptions));
        for (Room room : rooms) {
            if (room.getPlace() == selectOptions[0] &&
                    !room.isReserved() && (selectOptions[1] == 1) == room.isConditioner()
                    && (selectOptions[2] == 1) == room.isWc() &&
                    (selectOptions[3] == 1) == room.isTv()) {
                System.out.println("Комната " + room.getNumber());
            }
        }
    }

    public int correctNum() {
        int outNum = 0;
        boolean checkInput = false;
        while (!checkInput) {
            try {
                Scanner inpput = new Scanner(System.in);
                System.out.println("Введите требуемое число");
                outNum = inpput.nextInt();
                checkInput = true;
            } catch (Exception e) {
                System.out.println("Ошибка ввода !");
            }
        }
        return outNum;
    }
}