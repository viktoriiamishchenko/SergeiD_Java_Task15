public final class Manager extends BaseEmployee implements IName {

    private int numberOfSubordinates;

    public Manager(String name, int age, char gender, int salaryPerWorkDay, int numberOfSubordinates) {
        super(name, age, gender, salaryPerWorkDay);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public int getSalary(MonthUtils.IMonth[] monthArray) {
        int workDays = 0;
        int salarySum = 0;
        for (int i = 0; i < monthArray.length; i++) {
            workDays += monthArray[i].getWorkDaysInMonth();
            salarySum = (workDays * getSalaryPerWorkDay()) / 100 * (100 + numberOfSubordinates);
        }

        return salarySum;
    }

}
