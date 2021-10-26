public class MonthUtils  {

    public static class Month {

        private String nameOfMonth;
        private int dayInMonth;
        private int workDaysInMonth;

        public String getNameOfMonth() {
            return nameOfMonth;
        }

        public void setNameOfMonth(String nameOfMonth) {
            this.nameOfMonth = nameOfMonth;
        }

        public int getDayInMonth() {
            return dayInMonth;
        }

        public void setDayInMonth(int dayInMonth) {
            this.dayInMonth = dayInMonth;
        }

        public int getWorkDaysInMonth() {
            return workDaysInMonth;
        }

        public void setWorkDaysInMonth(int workDaysInMonth) {
            this.workDaysInMonth = workDaysInMonth;
        }

        public Month(String nameOfMonth, int dayInMonth, int workDaysInMonth) {
            this.nameOfMonth = nameOfMonth;
            this.dayInMonth = dayInMonth;
            this.workDaysInMonth = workDaysInMonth;
        }
    }

    public static final Month [] MONTHS = {

            new Month("January", 30, 21),
            new Month("February", 28, 19),
            new Month("March", 31, 20),
            new Month("April", 30, 20),
            new Month("May", 31, 20)

      };
}
