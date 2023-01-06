package state;

public class StatefulObject {

    private State state;

    public StatefulObject(State initialState) {
        setState(initialState);
    }

    public void setState(State state) {
        this.state = state;
    }

    public void handleSituationOne() {
        state.handleActionOne();
    }

    public void handleSituationTwo() {
        state.handleActionTwo();
    }
}
