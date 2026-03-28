import java.util.Scanner;


public class Car {
    String color;
    int maxSpeed;
    int acceleration;
    int tyreFriction;
    int currentSpeed;
    boolean isEngineStarted;
    
    Car(String carColor, int carMaxSpeed, int carAcceleration, int carTyreFriction){
        color = carColor;
        maxSpeed = carMaxSpeed;
        acceleration = carAcceleration;
        tyreFriction = carTyreFriction;
        currentSpeed = 0;
        isEngineStarted = false;
    }
    
    void startEngine() {
       isEngineStarted = true;
    }
    
    void stopEngine() {
       isEngineStarted = false;
    }
    
    void accelerate() {
        if(isEngineStarted) {
           currentSpeed = currentSpeed + acceleration;
           if(currentSpeed > maxSpeed){
                 currentSpeed = maxSpeed;
           }
       } 
    }
    
    void soundHorn() {
        if (isEngineStarted) {
           System.out.println("Peep Peep /n Beep Beep");
       }
    }
    
    void applyBrakes() {
       if(isEngineStarted) {
           currentSpeed = currentSpeed - tyreFriction;
           if(currentSpeed < 0) {
               currentSpeed = 0;
           }
       }
    }
}

class RaceCar extends Car {    
    int nitro;
    
    RaceCar(String carColor, int carMaxSpeed, int carAcceleration, int carTyrefriction, int carNitro) {
        super(carColor, carMaxSpeed, carAcceleration, carTyrefriction);
        nitro = carNitro;
    }
    
    void accelerate(){
       if(isEngineStarted) {
           int nitroSpeed = 0;
           if(nitro>0) {
               nitroSpeed = 20;
               nitro -= 1;
           }
           currentSpeed += acceleration + nitroSpeed;
           if(currentSpeed > maxSpeed) {
               currentSpeed = maxSpeed;
           } 
       }
    }
    
    void soundHorn() {
       if(isEngineStarted) {
           System.out.println("Peep Peep\nBeep Beep");
       }
       else {
           System.out.println("Car has not started yet");
       }
    }
}

class Base {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        RaceCar raceCar = new RaceCar(input.next(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt());
        raceCar.startEngine();
        raceCar.accelerate(); 
        System.out.println(raceCar.currentSpeed); 
        System.out.println(raceCar.nitro); 
        raceCar.accelerate(); 
        System.out.println(raceCar.currentSpeed); 
        System.out.println(raceCar.nitro); 
        raceCar.accelerate(); 
        System.out.println(raceCar.currentSpeed); 
        System.out.println(raceCar.nitro); 
        raceCar.applyBrakes(); 
        System.out.println(raceCar.currentSpeed); 
        System.out.println(raceCar.nitro);
        raceCar.accelerate(); 
        System.out.println(raceCar.currentSpeed); 
        System.out.println(raceCar.nitro); 
        raceCar.soundHorn();
    }
}
