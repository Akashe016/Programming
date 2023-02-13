class Bike1 {
String bikeName,color;
int speed;
Bike1(){

bikeName="Ns200";
color="White";
speed=200;
}
void run(){
System.out.println("This is Ns200 bike");
}
}
public class Constructor{
public static void main(String[] arg){

Bike1 bike = new Bike1();
System.out.println(Bike1.bikeName);
System.out.println(Bike1.color);
}
}

