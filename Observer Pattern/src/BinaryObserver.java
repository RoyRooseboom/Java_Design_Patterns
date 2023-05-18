public class BinaryObserver extends Observer
{
    // Attach itself to a subject.
    public BinaryObserver(Subject subject)
    {
        // Needed to know which subject to attach to.
        this.subject = subject;
        this.subject.attach(this);
    }

    // When notified, do this:
    @Override
    public void update()
    {
        System.out.println("Binary String: " + Integer.toBinaryString( subject.getState() ));
    }
}
