public class Aluno {
    private String nome;
    private int idade;
    private double nota1;
    private double nota2;
    private double media;
    private Disciplina disciplina;

    public Aluno(String nome, int idade, double nota1, double nota2, Disciplina disciplina) {
        this.nome = nome;
        this.idade = idade;
        if (nota1 > 0 && nota2 > 0) {
            this.nota1 = nota1;
            this.nota2 = nota2;
        } else {
            this.nota1 = 0;
            this.nota2 = 0;
        }
        this.disciplina = disciplina;
        this.media = calcularMedia();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        if (nota1 > this.nota1) {
            this.nota1 = nota1;
            this.media = calcularMedia();
        }
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        if (nota2 > this.nota2) {
            this.nota2 = nota2;
            this.media = calcularMedia();
        }
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        if (media == calcularMedia()) {
            this.media = media;
        } else {
            System.out.println("A média informada não corresponde à média calculada. Utilize o método calcularMedia().");
        }
    }

    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    public void status() {
        media = calcularMedia();
        System.out.println("Nome do Aluno: " + nome);
        System.out.println("Disciplina: " + disciplina.getNome() + " | Professor: " + disciplina.getProfessor());
        System.out.print("Status: ");
        if (media >= 7) {
            System.out.println("Aprovado\n");
        } else if (media >= 2) {
            System.out.println("Em Exame Final\n");
        } else {
            System.out.println("Reprovado\n");
        }
    }
}



