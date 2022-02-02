package Aula23;

public class Principal {
    public static void main(String[] args) {

        Instituto gerarRelatorio1 =  Instituto.getInstance();

        Curso frontend = new Curso("Curso Front-end", "Curso de frontend",16, 2, 100);
        Curso backend = new Curso("Curso Back-end", "Curso de backend", 20, 2, 900);
        Programa fullStack = new Programa("Programa FullStack", "Curso full stack", 20);
        fullStack.addCurso(backend);
        fullStack.addCurso(frontend);

        gerarRelatorio1.addOferta(frontend);
        gerarRelatorio1.addOferta(backend);
        gerarRelatorio1.addOferta(fullStack);

        //System.out.println(gerarRelatorio1);
        gerarRelatorio1.gerarRelatorio();
    }
}
