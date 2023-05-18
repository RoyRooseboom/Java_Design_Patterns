import java.util.ArrayList;
import java.util.List;

public class Subject
{
    // Holds a list of Observers
    private List<Observer> observers = new ArrayList<Observer>();
    private int state;

    public int getState()
    {
        return state;
    }

    // Changes the state, and notifies all observers
    public void setState(int state)
    {
        this.state = state;
        notifyAllObservers();
    }

    // Observers attach themselves through this method.
    public void attach(Observer observer)
    {
        observers.add(observer);
    }

    // Notifies all Observers
    public void notifyAllObservers()
    {
        for(Observer observer : observers)
        {
            observer.update();
        }
    }

}
