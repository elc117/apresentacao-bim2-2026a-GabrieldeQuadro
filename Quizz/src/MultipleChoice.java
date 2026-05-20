public class MultipleChoice extends Question{
    private String[] options;
    private int correctOption;

    public MultipleChoice(String statement, int points, String[] options, int correctOption){
        super(statement, points);
        this.options = options;
        this.correctOption = correctOption;
    }

    public String[] getOptions(){
        return options;
    }

    public int getCorrectOption() {
        return correctOption;
    }

    public void showQuestion() {
        System.out.println(statement);

        for (int i =0; i < options.length; i++) {
            System.out.println((i+1) + "-" + options[i]);
        }
    }
}
