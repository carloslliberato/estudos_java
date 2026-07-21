public class GradeBook {
    private String nomeCurso;
    private int[] notas;

    public GradeBook(String nomeCurso, int[] notas){
        this.nomeCurso = nomeCurso;
        this.notas = notas;
    }

    public void setCourseName(String nomeCurso){
        this.nomeCurso = nomeCurso;
    }

    public String getCourseName(){
        return this.nomeCurso;
    }

    public void processGrades(){
        outputGrades();

        System.out.printf("%nMédia da Turma: %.2f%n", getAverage());

        System.out.printf("A menor nota eh: %d%nA maior nota eh: %d%n", getMinimum(), getMaximum());

        outputBarChart();
    }

    public int getMinimum(){
        int menorNota = this.notas[0];

        for(int nota : this.notas){
            if(nota < menorNota){
                menorNota = nota;
            }
        }

        return menorNota;
    }

    public int getMaximum(){
        int maiorNota = this.notas[0];

        for(int nota : this.notas){
            if(nota > maiorNota){
                maiorNota = nota;
            }
        }

        return maiorNota;
    }

    public double getAverage(){
        int total = 0;

        for(int nota : this.notas){
            total += nota;
        }

        return (double) total / notas.length;
    }

    public void outputBarChart(){
        System.out.println("Distribuição de Notas: ");
        
        int[] frequencia = new int[11];

        for(int nota : this.notas){
            ++frequencia[nota/10];
        }

        for(int contador=0; contador<frequencia.length; contador++){
            if(contador == 10){
                System.out.printf("%5d: ", 100);
            }else{
                System.out.printf("%02d-%02d: ", contador*10, contador*10+9);
            }

            for(int estrelas=0; estrelas<frequencia[contador]; estrelas++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public void outputGrades(){
        System.out.printf("As notas sao: ");

        for(int aluno=0; aluno<this.notas.length; aluno++){
            System.out.printf("Aluno %2d: %3d%n", aluno+1, this.notas[aluno]);
        }
    }
}
