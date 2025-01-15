package entities;

public abstract class Taxes {

    private String name;
    private Double annualSalary;

    public Taxes(){
    }

    public Taxes(String name, Double annualSalary) {
        this.name = name;
        this.annualSalary = annualSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(Double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public abstract Double taxesCalculation();

}
