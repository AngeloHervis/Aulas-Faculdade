import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("\n\nTratamento de Excessões");

        Boolean menu = false;
        int[] vetor = {1,3,5};
        try {
            if (menu) {
                System.out.println("o menu existe");
            }else{
                throw new MinhaExcessao("O menu é falso");
            }
            System.out.println(vetor[2]);

            float result = 10/0;
            System.out.println(result);
        }catch(NullPointerException e){
            System.out.println("A variável está nula");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("O index está fora do tamanho do vetor");
        }catch (Exception e) {
            System.out.println("Não foi possível executar o programa " + e.getMessage());
        }finally{
            System.out.println("Eu executo sempre");
        }


        Aluno a1 = new Aluno("Aluno 1", "Endereco 3", 18);
        Aluno a2 = new Aluno("Aluno 2", "Endereco 4", 16);
        Aluno a3 = new Aluno("Aluno 3", "Endereco 1", 38);
        Aluno a4 = new Aluno("Aluno 4", "Endereco 5", 28);
        Aluno a5 = new Aluno("Aluno 5", "Endereco 2", 48);


        Escola escola = new Escola(new ArrayList<>());

        escola.getAlunos().addAll(Arrays.asList(a1, a2, a3, a4, a5));
        System.out.println(escola);
        escola.ordenarPorEndereco();
        System.out.println(escola);
        escola.ordenarPorIdade();
        System.out.println(escola);

        Collections.shuffle(escola.getAlunos());
        System.out.println(escola);

        try {  
            Aluno aluno = escola.buscarAluno("Aluno 6");
            System.out.println(aluno);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
