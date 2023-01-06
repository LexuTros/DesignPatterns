package state;

public class StateMain {
    public static void main(String[] args) {

        StatefulObject aStatefulObject = new StatefulObject();

        aStatefulObject.handleSituationOne();
        aStatefulObject.handleSituationOne();

        aStatefulObject.handleSituationTwo();

    }
}
