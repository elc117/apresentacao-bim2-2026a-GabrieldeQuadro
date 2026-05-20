public class TrueFalse extends Question {
    private  boolean correctAnswer;

    public  TrueFalse(String statement, int points, boolean correctAnswer) {
        super(statement, points);
        this.correctAnswer = correctAnswer;
    }

    public boolean getCorrectAnswer() {
        return correctAnswer;
    }

    public void showQuestion() {
        System.out.println(statement);
        System.out.println("(V) Verdadeiro");
        System.out.println("(F) Falso");

    }
}
