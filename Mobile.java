package week1.day1;

public class Mobile {
String phoneModal="iPhone12";	
int phoneNumber=933243553;
	
public void makeCall() {
	// TODO Auto-generated method stub
System.out.println("firstMethod-makecall");
}
public void sendSms() {
	// TODO Auto-generated method stub
String phoneModel = "iPhone11";
System.out.println(phoneModel);
System.out.println("secondMethod-sendSms");
}
public static void main(String[] args) {
	
Mobile communication=new Mobile();
communication.sendSms();
communication.makeCall();
System.out.println(communication.phoneModal);
System.out.println(communication.phoneNumber);
}
}