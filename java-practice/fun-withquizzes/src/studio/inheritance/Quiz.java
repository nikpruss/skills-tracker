package studio.inheritance;

import java.util.ArrayList;

public class Quiz {
    private int questionType;
    ArrayList <MultipleChoice> questionsM = new ArrayList<>();
    ArrayList <Checkbox> questionsC = new ArrayList<>();
    ArrayList <TrueFalse> questionsTF = new ArrayList<>();

    public void addQuestion (int qType){
        if (qType == 1){
            MultipleChoice question = new MultipleChoice();
            questionsM.add(question);
        } else if (qType == 2){
            Checkbox question = new Checkbox();
            questionsC.add(question);
        } else {
            TrueFalse question = new TrueFalse();
            questionsTF.add(question);
        }
    }

    public void runQuizz (){
        questionsC.forEach((c) -> System.out.println(c));
        questionsM.forEach((m) -> System.out.println(m));
        questionsTF.forEach((t) -> System.out.println(t));
    }

    public int gradeQuizz (){
        int grade = 0;
        return grade;
    }
}
