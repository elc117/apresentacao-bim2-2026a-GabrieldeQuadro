import java.awt.*;

public class Question {
    protected String statement;
    protected int points;

    public Question(String statement, int points) {
        this.statement = statement;
        this.points = points;
    }

    public String getStatement() {
        return statement;
    }

    public int getPoints() {
        return points;
    }

    public void showQuestion(){
        System.out.println(statement);
    }

}
