public class Vehicle {
   private String name;
   private int topSpeed;
   private int makeYear;
   private String fuelType;
   
   public void setName(String vehicleName) {
       this.name = vehicleName;
   }
   
   public String getName() {
       return this.name;
   }
   
   public void setTopSpeedMPH(int vehicleSpeed) {
       this.topSpeed = vehicleSpeed;
   }
   
   public int getTopSpeedMPH() {
       return this.topSpeed;
   }
   
   public void setMakeYear(int year) {
       this.makeYear = year;
   }
   
   public int getMakeYear() {
       return this.makeYear;
   }
   
   public void setFuelType(String fuel) {
       this.fuelType = fuel;
   }
   
   public String getFuelType() {
       return this.fuelType;
   }
}



class Main {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        Vehicle vehicle =  new Vehicle();
        vehicle.setName(input.next());
        System.out.println(vehicle.getName()); 
        vehicle.setTopSpeedMPH(input.nextInt()); 
        System.out.println(vehicle.getTopSpeedMPH()); 
        vehicle.setMakeYear(input.nextInt());
        System.out.println(vehicle.getMakeYear()); 
        vehicle.setFuelType(input.next()); 
        System.out.println(vehicle.getFuelType());
    }
}
