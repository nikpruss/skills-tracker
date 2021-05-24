package studio.inheritance;

import java.util.ArrayList;

public class MultipleChoice extends Question{
    private ArrayList<String> choices = new ArrayList<>();

    public MultipleChoice() {
        super();
    }

    public void setChoices (String newC){
        this.choices.add(newC);
    }

    public ArrayList<String> getChoices () {
        return this.choices;
    }
}
