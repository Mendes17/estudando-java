package entities;

public class NaturalPerson extends Taxes{

    private Double healthExpenses;

    public NaturalPerson() {
        super();
    }

    public NaturalPerson(String name, Double annualSalary, Double healthExpenses) {
        super(name, annualSalary);
        this.healthExpenses = healthExpenses;
    }

    public Double getHealthExpenses() {
        return healthExpenses;
    }

    public void setHealthExpenses(Double healthExpenses) {
        this.healthExpenses = healthExpenses;
    }

    @Override
    public Double taxesCalculation() {
         if (super.getAnnualSalary() < 20000) {
            return (super.getAnnualSalary() * 0.15) - (healthExpenses * 0.5);
        } else {
             return (super.getAnnualSalary() * 0.25) - (healthExpenses * 0.5);
         }
    }
}
