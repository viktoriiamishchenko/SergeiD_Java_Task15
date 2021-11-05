public class MonthUtils  {

    public interface IMonth {
        String getNameOfMonth();
        int getDayInMonth();
        int getWorkDaysInMonth();
    }

    private static class MonthImpl implements IMonth {

        private String nameOfMonth;
        private int dayInMonth;
        private int workDaysInMonth;

        public MonthImpl(String nameOfMonth, int dayInMonth, int workDaysInMonth) {
            this.nameOfMonth = nameOfMonth;
            this.dayInMonth = dayInMonth;
            this.workDaysInMonth = workDaysInMonth;
        }

        public String getNameOfMonth () {
            return nameOfMonth;
        }

        public int getDayInMonth() {
            return dayInMonth;
        }

        public int getWorkDaysInMonth() {
            return workDaysInMonth;
        }
    }

    public static final IMonth [] MONTHS = {

            new MonthImpl("January", 30, 21),
            new MonthImpl("February", 28, 19),
            new MonthImpl("March", 31, 20),
            new MonthImpl("April", 30, 20),
            new MonthImpl("May", 31, 20)

      };
}
