public class BaseEmployee {

    public String name;
    public int age;
    public char gender;
    public int salaryPerWorkDay;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getSalaryPerWorkDay() {
        return salaryPerWorkDay;
    }

    public void setSalaryPerWorkDay(int salaryPerWorkDay) {
        this.salaryPerWorkDay = salaryPerWorkDay;
    }

    public BaseEmployee(String name, int age, char gender, int salaryPerWorkDay) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salaryPerWorkDay = salaryPerWorkDay;
    }

    public int getSalary(MonthUtils.IMonth[] monthArray) {
        int workDays = 0;
        int salarySum = 0;
        for (int i = 0; i < monthArray.length; i++) {
            workDays += monthArray[i].getWorkDaysInMonth();
            salarySum = workDays * getSalaryPerWorkDay();
        }

        return salarySum;
    }
}
