import java.util.ArrayList;

public class Quiz {
    private String title;
    private ArrayList<Question> questions;

    public Quiz(String title) {
        this.title = title;
        this.questions = new ArrayList<Question>();
    }

    public String getTitle(){
        return title;
    }

    public void addQuestion(Question q) {
        questions.add(q);
    }
    public int countQuestions() {
        return questions.size();
    }

    public void showQuiz() {
        System.out.println("Quiz: "+ title);

        for (Question q: questions) {
            q.showQuestion();
            System.out.println();
        }
    }

    public Question randomQuestion() {
        int index = (int)(Math.random() * questions.size());
        return questions.get(index);
    }


}