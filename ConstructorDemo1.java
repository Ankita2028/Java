//parameterized constructor
class Car{
  char model;
  int year;
  //creating a parameterized constructor
  Car(char model, int year)
  this.model = model;
  this.year = year;
  // method tp display the value of modelno and year
  void display(){
    System.out.println("Model: " + model + " Year: " + year);
  }
  public static void name (String[] args){
    Scanner scanner = new Scanner(System.in);
    char charModelName = scanner.nextLine().trim().charAt(0);
    int intYearOfMaking = scanner.nextInt();
    //creating a object and pass the value
    Car obj1 = new Car(charModelName, intYearOfMaking);
    Car obj2 = new Car('S', 2019);
    //calling method to display the value of object
    obj1.display();
    obj2.display();
  }

}
