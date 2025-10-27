package soal5;

public class Assignment extends Assessment implements Gradable {
    double score;

    public Assignment(double score) {
        this.score = score;
    }

    @Override
    public double calculateFinalScore() {
        return score;
    }

    @Override
    public String getGrade() {
        if (score >= 90) return "A";
        else if (score >= 75) return "B";
        else if (score >= 60) return "C";
        else return "D";
    }
}
