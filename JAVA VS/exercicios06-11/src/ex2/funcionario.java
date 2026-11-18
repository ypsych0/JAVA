package ex2;

public abstract class funcionario {
    protected String nome;
    protected double salarioBase;
    protected String cargo;

    funcionario(String nomeF, double salarioF, String cargoF) {
        this.nome = nomeF;
        this.salarioBase = salarioF;
        this.cargo = cargoF;
    }

    public double calcularSalario() {
        return (this.salarioBase);
    }

    public void exibirRecibo() {
        System.out.println("Recibo de pagamento");
        System.out.println("\n"+ this.cargo);
        System.out.println("Nome: " + this.nome);
        System.out.println("Salário: " + this.calcularSalario());
        System.out.println("Salario Final: " + calcularSalario());
    }

}
