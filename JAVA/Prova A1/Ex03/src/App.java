public class App {
    public static void main(String[] args) {
        Disciplina disciplina = new Disciplina("Programação Orientada a Objetos", "João");
        Aluno aluno = new Aluno("Ângelo", 18, 7.5, 4.5, disciplina);
        aluno.status();
        aluno.setNota1(0.5);
        aluno.status();
        aluno.setNota1(10.0);
        aluno.status();
    }
}
