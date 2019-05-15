public class EmployeePartTime extends SalaryPolicy {
    private float rate;

    public EmployeePartTime() {
    }

    public EmployeePartTime(float rate) {
        this.rate = rate;
        rate = (float) 2.5;
    }

    @Override
    public void getSalary(float salary) {
        salary = baseSalary*rate;
    }
}
