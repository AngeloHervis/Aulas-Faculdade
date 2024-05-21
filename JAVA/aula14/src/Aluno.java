public class Aluno implements Comparable<Aluno> {
    private String nome, rua;
    private int idade;
    
    public Aluno(String nome, String rua, int idade) {
        this.nome = nome;
        this.rua = rua;
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    @Override
    public String toString() {
        return "\nAluno [nome=" + nome + ", rua=" + rua + ", idade=" + idade + "]";
    }
    @Override
    public int compareTo(Aluno aluno) {
        return nome.compareTo(aluno.nome);
    }   
}
