interface Power {
 void turnOn(); 

 default void status() {
     System.out.println("Power status: ON");
 }
}
class Device implements Power {
 public void turnOn() {
     System.out.println("Device is turning on...");
 }
public class DefaultPowerDemo {
    public static void main(String[] args) {
     Device myDevice = new Device();
     myDevice.turnOn();   
     myDevice.status();   
 }
}
}