public class AppStart
{
    public static void main(String[] args)
    {
        // Creates a Subject
        Subject subject = new Subject();
        // Makes an Observer, who will attach itself to the subject
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        // Changes the state of the subject
        subject.setState(15);
    }
}
