import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Room[] rooms = {
                new Room(11, 3, true, true, true),
                new Room(12, 3, true, false, true),
                new Room(13, 2, true, true, true),
                new Room(21, 1, false, false, false),
                new Room(22, 4, true, true, true),
                new Room(23, 1, false, false, true),
                new Room(31, 2, true, true, true),
                new Room(32, 3, false, true, false),
                new Room(33, 5, true, true, true),
        };
        Hotel hotel = new Hotel(rooms);
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        while (true) {
            if(command.equals("/getFreeRooms")){
                hotel.getFreeRooms();
            } else if (command.equals("/reserve")) {
                System.out.println("Введите номер комнаты для бронирования");
                int num = Integer.parseInt(scanner.nextLine());
                hotel.reserve(num);
            } else if (command.equals("/getFreeRooms -f")) {
                hotel.getFreeRoomsFilter();
            }
        }
    }
}