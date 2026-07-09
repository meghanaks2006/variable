public class Car{
    String color;
    String model;
    int year;
    void displayDetails(){
    System.out.println("Model:"+model);
    System.out.println("Color:"+color);
    System.out.println("Year:"+year);
}
public static void main(String[]args){
    Car myCar=new Car();
    myCar.color="Red";
    myCar.model="Toyota";
    myCar.year=2006;
    mycar.displayDetails();    
}
}