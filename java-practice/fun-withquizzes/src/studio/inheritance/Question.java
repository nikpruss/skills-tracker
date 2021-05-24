package studio.inheritance;

public abstract class Question {
    private String qPrompt;


    public Question () {

    }

    public void setqPrompt (String newQ) {
        this.qPrompt = newQ;
    }

    public String getqPrompt () {
        return this.qPrompt;
    }
}
