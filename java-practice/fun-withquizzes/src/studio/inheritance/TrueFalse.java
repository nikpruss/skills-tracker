package studio.inheritance;

import java.util.ArrayList;

public class TrueFalse extends Question{
    private boolean aTrue;
    private boolean aFalse;

    public TrueFalse() {
        super();
    }

    public void setaTrue (boolean newT){
        this.aTrue = newT;
        this.aFalse = !newT;
    }

    public void setaFalse (boolean newT){
        this.aFalse = newT;
        this.aTrue = !newT;
    }

    public boolean getaTrue () {
        return this.aTrue;
    }

    public boolean getaFalse () {
        return this.aFalse;
    }
}
