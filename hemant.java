class hemant
{
  int id;
  int salary;
  String name;
  public void printDetails()
  {
    System.out.println("my id is "+ id);
    System.out.println("and my name is"+ name);
  }
  public int getSalary()
  {
    return salary;
  }

  
    public static void main(String[]args)
    {
      System.out.println("this our custum class" );
      hemant amit=new hemant();
      hemant aditya=new hemant();
      aditya.id=17;
      aditya.salary=12;
      aditya.name="aditya dash";
      amit.printDetails();
      aditya.printDetails();
      int salary =aditya.getSalary();
      System.out.println(salary);

    }
  }
