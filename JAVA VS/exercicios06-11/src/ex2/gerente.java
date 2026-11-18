package ex2;

public class gerente extends funcionario {
    private double bonus;

    gerente(String nomeG, double salarioG, double bonus) {
        super(nomeG, salarioG , "Gerente");
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        return (this.salarioBase + this.bonus);
    }
    
}
