package homeworkPackage;

public class ComputerTestClass {
   static String storageCapacity; //static variable 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Computer computer = new Computer();
	   computer.getComputerNumber();
	   Computer computer1 = new Computer();
	   String computerName=computer1.getComputerName();
	    System.out.println(computerName);
		
        Computer.getComputerColor();//we get result without creating object of class Computer
        Computer computer2 = new Computer();
        storageCapacity=computer2.getComputerStorageCapacity();
        System.out.println(storageCapacity);
        
        Computer computerConstructor=new Computer (2000,3000);
        
	}

}
