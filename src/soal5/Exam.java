package soal5;

public class Exam extends Assessment implements Gradable {
    double score;

    public Exam(double score) {
        this.score = score;
    }

    @Override
    public double calculateFinalScore() {
        return score;
    }

    @Override
    public String getGrade() {
        if (score >= 85) return "A";
        else if (score >= 70) return "B";
        else if (score >= 55) return "C";
        else return "D";
    }
}
