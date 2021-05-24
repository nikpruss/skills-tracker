package studio.inheritance;

public class QuizRunner {
    public static void main (String[] args){
        Quiz quizTest = new Quiz();
        quizTest.addQuestion(1);
        quizTest.runQuizz();
        quizTest.gradeQuizz();
    }
}
