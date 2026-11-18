package ex1;

public class veiculo {
   protected String marca;
   protected String modelo;
   protected int ano;

   public veiculo(String marcaV, String modeloV, int anoV) {
      this.marca = marcaV;
      this.modelo = modeloV;
      this.ano = anoV;
   }
   
   public void exibirDetalhes() {
      System.out.println("Marca: " + this.marca);
      System.out.println("Modelo: " + this.modelo);
      System.out.println("Ano: " + this.ano);
   }
}
