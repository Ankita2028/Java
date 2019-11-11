//Java program more than one constructor
class Employ{
  int id;
  string name;
  int salary;

//creating two argument constructor
Emlpoy(int i , string n){
  int = i;
  string = n;
}
//creating three argument constructor
Employ(int i , string n , int s){
  int = i;
  string = n;
  int = s;
}
// method to display the value
void display(){
  System.out.println("id"+"name"+"salary");
}
public static void main(String[] args){
  // create a object
  Employ obj1 = new Employ(2201," adi");
  Employ obj2 = new Employ(2811,"ani","30000");
  obj1.display();
  obj2.display();
}
}
