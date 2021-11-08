package br.com.alura;

public class TestaCurso {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as coleções do Java",
                    "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 24));

        
     // tentando adicionar da maneira "antiga". Podemos fazer isso? Teste:
//        Exception in thread "main" java.lang.UnsupportedOperationException
//    	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1058)
//    	at br.com.alura.TestaCurso.main(TestaCurso.java:16)
//        
//        aparece uma exception
//        javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));

      
        System.out.println(javaColecoes.getAulas());
    }
}
