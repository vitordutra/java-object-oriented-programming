package Aula15.Embarcacoes;


public class Principal {
    public static void main(String[] args) {
        Capitao cap1 = new Capitao("Alecio", "Gomes", "306050");
        Capitao cap2 = new Capitao("Marcela", "Cintra","708090");

        Veleiro vel1 = new Veleiro(10000, 200, 2017, 30, cap2,2);
        Veleiro vel2 = new Veleiro(5000, 100, 2021,18, cap1, 1);

        Iate i1 = new Iate(12000, 200, 2021, 50, cap1,20);
        Iate i2 = new Iate (15000, 300, 2009, 60, cap2, 25);

        Estaleiro buenosAires = new Estaleiro("Buenos Aires");

        System.out.println(cap1);
        System.out.println(cap2);

        System.out.println(vel1);
        System.out.println(vel2);

        vel1.avaliarTamanho();
        vel1.calcularAluguel();
        vel2.calcularAluguel();
        vel2.avaliarTamanho();

        buenosAires.adicionarEmbarcacao(vel1);
        buenosAires.adicionarEmbarcacao(vel2);
        buenosAires.adicionarEmbarcacao(i1);
        buenosAires.adicionarEmbarcacao(i2);
        System.out.println(buenosAires.getEmbarcacoes());

        System.out.println(i1.compareTo(i2));

    }
}


