package ex3;

public abstract class zoologico {
    protected String animal;

    zoologico(String animal) {
        this.animal = animal;
    }

    public abstract String fazerSom();

    public void exibir() {
        System.out.println("Animal: " + this.animal + " faz " + fazerSom());
    }
}
