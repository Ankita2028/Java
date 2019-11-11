//example of default constructor
class Student{
  int rollno;
  String name;
  // method to display the value of rollno and name
  void display(){
    System.out.println("rollno"+"name")
  }
  public static void main(String[] args){
    //creating obj
    Student s1 = new Student();
    // display the value of object
    s1.display();
  }
}
