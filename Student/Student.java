public class Student {
    private String name;
    private double[] scores;

    public Student(String studentName){
        name = studentName;
        scores = new double[2];
        // scores are |total student score|number of tests|
    }

    public String getName(){
        return name;
    }

    public void addQuiz(int score){
        scores[0] += score;
        scores[1] += 1;
    }

    public double getTotalScore(){
        return scores[0];
    }

    public double getAverageScore(){
        return (scores[0] / scores[1]);
    }
}
