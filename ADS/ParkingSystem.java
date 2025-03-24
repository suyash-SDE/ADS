public class ParkingSystem {
    private int[] parkingSlots;

    public ParkingSystem(int big, int medium, int small) {
        parkingSlots = new int[]{big, medium, small};
    }

    public boolean addCar(int carType) {
        if (parkingSlots[carType - 1] > 0) {
            parkingSlots[carType - 1]--;
            return true;
        }
        return false;
    }
}
