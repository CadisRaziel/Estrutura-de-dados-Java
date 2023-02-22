package Map;

import java.util.*;

public class Main {
    public static void main(String[] args) {
      Map<String, String> aluno = new HashMap<String, String>();


      aluno.put("Nome", "Vitor");
      aluno.put("Idade", "30");
      aluno.put("Media", "10");
      aluno.put("Turma", "1");


        System.out.println(aluno);

        //mostra só as chaves
        System.out.println(aluno.keySet());

        //mostra so os valores
        System.out.println(aluno.values());


        List<Map<String, String>> listaAlunos = new ArrayList<Map<String, String>>();
        listaAlunos.add(aluno);


        Map<String, String> aluno2 = new HashMap<String, String>();

        aluno2.put("Nome", "Ariella");
        aluno2.put("Idade", "2");
        aluno2.put("Media", "10");
        aluno2.put("Turma", "0");

        listaAlunos.add(aluno2);

        System.out.println(listaAlunos);

        //para ver se tem a chave chamada "Nome"
        System.out.println(aluno.containsKey("Nome"));
    }
}
