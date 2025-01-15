package entities;

public class Employees {

    private String nome;
    private Integer id;
    private Double salario;

    public Employees() {
    }

    public Employees(String nome, Integer id, Double salario) {
        this.nome = nome;
        this.id = id;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Double aumentarSalario(double porcentagem) {
        return salario += salario * porcentagem / 100.0;
    }

    public String toString() {
        return id + ", " + nome + ", " + String.format("%.2f", salario);
    }
}
