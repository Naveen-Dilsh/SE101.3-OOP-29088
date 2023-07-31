public class Question3 {

    public static void main(String[] args) {
        Employee e1=new Employee("Supun",22,50000.00);

        //display the values
        String a= e1.getName();
        int b= e1.getAge();
        double c= e1.getSalary();

        System.out.println("Name is:" +a);
        System.out.println("Age is:" +b);
        System.out.println("Salary is:"+c);
    }
}