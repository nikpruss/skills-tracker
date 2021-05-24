package studio.inheritance;

import java.util.ArrayList;

public class Checkbox extends Question{
    private ArrayList<String> checkboxes = new ArrayList<>();

    public Checkbox() {
        super();
    }

    public void setCheckboxes (String newC){
        this.checkboxes.add(newC);
    }

    public ArrayList<String> getCheckboxes () {
        return this.checkboxes;
    }
}
