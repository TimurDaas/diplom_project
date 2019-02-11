package ua.com.timur.common.states;



/**
 * Created by тимур50 on 12.02.2019.
 */
public enum State {

    ACCEPTED(1000),
    NOT_ALL_SIGNS(1001),
    NO_SIGNS(1002),
    SENT_TO_BANK(1003),
    REJECTED_BY_SYSTEM(1004),
    REJECTED_BY_BANK(1005),
    VIRUS_SEARCHING(1010),
    VIRUS_DETECTED(1011);


    private int state;

    State(int state) {
        this.state = state;
    }

    public int getCode(){
        return this.state;
    }

    public State valueOf(int code){
        for (State value : State.values()){
            if (value.getCode()== code)
                return value;
        }
        return null;
    }
}
