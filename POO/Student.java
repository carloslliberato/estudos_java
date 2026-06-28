
public class Student{

    private String name;
    private double average;
    
    public Student(String name, double average){
        this.name = name;

        if(average > 0.0 && average <= 100.0){
            this.average = average;
        }
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setAverage(double studentAverage){
        if(studentAverage > 0.0 && studentAverage <= 100.0){
            this.average = studentAverage;
        }
    }

    public double getAverage(){
        return this.average;
    }

    public String getLetterAverage(){

        String letterGrade;

        if(this.average >= 90.0){
            letterGrade = "A";
        }else if (this.average >= 80.0){
            letterGrade = "B";
        }else if (this.average >= 70.0){
            letterGrade = "C";
        }else if (this.average >= 60){
            letterGrade = "D";
        }else{
            letterGrade = "F";
        }

        return letterGrade;
    }
}