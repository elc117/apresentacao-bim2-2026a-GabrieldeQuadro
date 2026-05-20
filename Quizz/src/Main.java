import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Quiz quiz = new Quiz("Quiz de Programação");

        TrueFalse q1 = new TrueFalse(
                "Java é uma linguagem orientada a objetos?",
                5,
                true
        );

        String[] options = {
                "Python",
                "HTML",
                "Java",
                "CSS"
        };

        MultipleChoice q2 = new MultipleChoice(
                "Qual destas opções é uma linguagem de programação?",
                10,
                options,
                3
        );

        String[] choice = {
                "1",
                "5",
                "7",
                "9"
        };

        MultipleChoice q3 = new MultipleChoice(
                "Resultado para 3x3?",
                10,
                choice,
                4
        );

        quiz.addQuestion(q1);
        quiz.addQuestion(q2);
        quiz.addQuestion(q3);

        System.out.println("1 - Mostrar todas as questões");
        System.out.println("2 - Sortear uma questão");

        int option = input.nextInt();

        switch (option) {

            case 1:
                quiz.showQuiz();
                break;

            case 2:
                Question random = quiz.randomQuestion();

                System.out.println("Questão sorteada:");
                random.showQuestion();
                break;

            default:
                System.out.println("Opção inválida");
        }

        input.close();
    }
}