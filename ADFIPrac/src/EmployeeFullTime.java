public class EmployeeFullTime extends SalaryPolicy {
    private float rate;

    public EmployeeFullTime() {
    }

    public EmployeeFullTime(float rate) {
        this.rate = rate;
        rate = 4;
    }

    @Override
    public void getSalary(float salary) {
        salary = baseSalary*rate;
    }
}
