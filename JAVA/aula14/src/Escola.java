import java.util.Collections;
import java.util.List;

public class Escola {
    private List<Aluno> alunos;

    public Escola(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Aluno buscarAluno(String nome) throws Exception{
        return alunos.stream().filter(a -> a.getNome().equals(nome)).findFirst().orElseThrow(() -> new Exception("Aluno não Encontrado"));    
    }

    public void ordenarPorNome(){
        Collections.sort(alunos);
    }

    public void ordenarPorEndereco(){
        Collections.sort(alunos, (a1,a2) -> a1.getRua().compareTo(a2.getRua()));
    }

    public void ordenarPorIdade(){
        Collections.sort(alunos, (a1, a2) -> Integer.compare(a1.getIdade(),a2.getIdade()));
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    @Override
    public String toString() {
        return "Escola [alunos=" + alunos + "]";
    }   
    
}
