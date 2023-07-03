import java.util.Scanner;

/*
 * Администратор гостиницы принимает посетителей
 * для упралвения гостиницей у него есть команды
 * - /getFreeRooms - показывает все свободные компнаты (номера)
 * - /reserve - бронирует комнату
 * - /getFreeRooms -f - с фильтрами
 * */
public class Main {
    public static void main(String[] args) {
        Room[] rooms = {
                new Room(11, 2, true, true, true),
                new Room(12, 1, true, false, true),
                new Room(13, 1, true, true, true),
                new Room(21, 4, false, false, false),
                new Room(22, 3, true, true, false),
                new Room(23, 2, false, true, false),
                new Room(31, 4, true, true, false),
                new Room(32, 2, false, false, false),
                new Room(33, 3, true, true, true)
        };
        Hotel hotel = new Hotel(rooms);
        Scanner scanner = new Scanner(System.in);
        while (true){
            String command = scanner.nextLine();
            if(command.equals("/getFreeRooms"))
                hotel.getFreeRooms();
            else if (command.equals("/reserve")) {
                System.out.println("Введите номер комнаты для бронирования");
                int num = Integer.parseInt(scanner.nextLine());
                hotel.reserve(num);
            } else if (command.equals("/getFreeRooms -f")) {
                hotel.getFreeRoomsFilter();
            }
        }
    }
}