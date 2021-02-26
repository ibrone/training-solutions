package exam03retake02;

public enum State {COMPLETED(1),NON_COMPLETED(0);

    public int state;



    State (int state){
        this.state= state;

    }
    public int getState(){

        return state;
    }

}
