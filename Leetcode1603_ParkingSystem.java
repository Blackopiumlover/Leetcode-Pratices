public class Leetcode1603_ParkingSystem {
    private int big;
    private int medium;
    private int small;

    public static void main(String[] args) {
        Leetcode1603_ParkingSystem parkingSystem = new Leetcode1603_ParkingSystem(1, 1, 0);
        System.out.println(parkingSystem.addCar(1)); // 返回 true ，因为有 1 个空的大车位
        System.out.println(parkingSystem.addCar(2)); // 返回 true ，因为有 1 个空的中车位
        System.out.println(parkingSystem.addCar(3)); // 返回 false ，因为没有空的小车位
        System.out.println(parkingSystem.addCar(1)); // 返回 false ，因为没有空的大车位，唯一一个大车位已经被占据了
    }

    public Leetcode1603_ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType){
        if(carType == 1){
            if(big - 1 >= 0){
                big = big - 1;
                return true;
            }
            return false;
        }
        if(carType == 2){
            if(medium - 1 >= 0){
                medium = medium - 1;
                return true;
            }
            return false;
        }
        if(carType == 3){
            if(small - 1 >= 0){
                small = small - 1;
                return true;
            }
            return false;
        }
        return false;
    }
    
}
