package ex2;

public class testeMain {

    public static void main(String[] args) {
        
        colaborador c1 = new colaborador("Lucas", 5000);
        
        gerente g1 = new gerente("Maria", 3000, 10000);

        c1.exibirRecibo();

        g1.exibirRecibo();
       
    }

}
