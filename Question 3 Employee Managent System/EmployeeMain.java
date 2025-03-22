
import java.util.HashSet;

class  EmployeeDetails{


    HashSet<Employees> empset=new HashSet<>();

   Employees emp1=new Employees(101,"PraveenKumar",250000);
    Employees emp2=new Employees(101,"GokulRajan",550000);
    Employees emp3=new Employees(101,"DhineshKumar",650000);

  public   EmployeeDetails(){
        empset.add(emp1);
        empset.add(emp2);
        empset.add(emp3);
    }



    public void displayDetails(){

      for(Employees emp:empset){
          System.out.println(emp);
      }
    }

}





public class EmployeeMain {




    public static void main(String[] args) {
           EmployeeDetails empdetails=new EmployeeDetails();

           System.out.println("Displaying All Employees");
           empdetails.displayDetails();
    }
}