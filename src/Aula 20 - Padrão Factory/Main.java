//package Aula17DesignPatterns;
//
//public class Main {
//    public static void main(String[] args) {
//        Empresa empresa = new Empresa("12345");
//
//        EmpregadoFactory empregadoFactory = EmpregadoFactory.getInstance();
//
//        System.out.println(empregadoFactory.hashCode());
//
//        EmpregadoFactory empregadoFactory2 = EmpregadoFactory.getInstance();
//
//        System.out.println(empregadoFactory2.hashCode());
//
//        Empregado joao = empregadoFactory.criarEmpregado("EMP-INT");
//        joao.setNome("João");
//
//        System.out.println(joao.getNome());
//
//        empresa.addEmpregado(joao);
//
//        System.out.println(empregadoFactory.criarEmpregado("EMP-EXT"));
//
//        empresa.addEmpregado(empregadoFactory.criarEmpregado("EMP-EXT").setNome("Yana"));
//    }
//}
