package homeworkPackage;

public class Computer {
 String ComputerName="mac";
 String storageCapacity="1T";
 
 
 public void  getComputerNumber () {
	 System.out.println("the Computer's number is 2 ");
 }
 public String getComputerName() {
	return ComputerName ;
	 
 }
 public static void getComputerColor() {
	System.out.println("black"); 
 }//static method 
 public String getComputerStorageCapacity() {
	 return storageCapacity;
 }
  Computer(){
	 System.out.println("this is computer constructor" );
 }//constructor without arguments
 Computer( int d,int e){
	  System.out.println("computer price is "+ d+e);
 }//constructor wit arguments
}
