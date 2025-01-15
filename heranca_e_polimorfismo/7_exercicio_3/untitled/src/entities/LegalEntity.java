package entities;

public class LegalEntity extends Taxes {

    private Integer employees;

    public LegalEntity() {
        super();
    }

    public LegalEntity(String name, Double annualSalary, Integer employees) {
        super(name, annualSalary);
        this.employees = employees;
    }

    public Integer getEmployees() {
        return employees;
    }

    public void setEmployees(Integer employees) {
        this.employees = employees;
    }

    @Override
    public Double taxesCalculation() {
        if (employees > 10) {
            return super.getAnnualSalary() * 0.14;
        } else {
            return super.getAnnualSalary() * 0.16;
        }
    }
}
