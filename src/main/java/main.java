public class main {

    public static void main (String [] args) {

        BaseEmployee employee = new Employee("Sergei", 33, 'm', 1000);
        BaseEmployee manager = new Manager("Gil", 35, 'm', 1000, 10);

        System.out.println(employee.getSalary(MonthUtils.MONTHS));
        System.out.println(manager.getSalary(MonthUtils.MONTHS));
    }
}
