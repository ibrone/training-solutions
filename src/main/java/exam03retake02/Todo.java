package exam03retake02;



public class Todo {

    private String text;
    private State state;
    private int priority;

    public Todo(String text, int priority) {
        this.text = text;
        this.priority = priority;

    }

    public String getText() {
        return text;
    }

    public State getState() {
        return state;
    }

    public int getPriority() {
        if (priority <1 || priority >6){
            throw new IllegalArgumentException("Invalid");
        }
        else
            return priority;
    }


    public void complete() {
//        állapot átállítás hiányzik if
//
//        }
//        else {
//            state.getState() =1 ;
//        }
    }

}
