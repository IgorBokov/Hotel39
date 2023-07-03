public class Hotel {
    private Room[] rooms;

    public Hotel(Room[] rooms) {
        this.rooms = rooms;
    }

    public void getFreeRooms(){
        for (Room room : rooms) {
            if(!room.isReserved()){
                System.out.print(room.getNumber()+", ");
            }
        }
    }
    public void reserve(int num){
        for (Room room : rooms) {
            if (num == room.getNumber()){
                if (room.isReserved())
                    System.out.println("Комната уже забронирована другим посетителем");
                else{
                    System.out.println("Комната успешно забронирована");
                    room.setReserved(true);
                }
            }
        }
    }
    public void getFreeRoomsFilter(){
        /*
         * Спрашиваете каккие характеристики комнаты нужны
         * И выводите те комнаты, которые подходят под выборку
         * */
    }
}
