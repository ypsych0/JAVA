package ex1;

public class carro extends veiculo {
    private int quantidadePortas;

   public carro(String marcaC, String modeloC, int anoC, int qty) {
      super(marcaC, modeloC, anoC);
      this.quantidadePortas = qty;
   }

   @Override
   public void exibirDetalhes() {
      System.out.println("Marca: " + this.marca);
      System.out.println("Modelo: " + this.modelo);
      System.out.println("Ano: " + this.ano);
      System.out.println("Portas: " + this.quantidadePortas);
   }
}