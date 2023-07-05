/*abstract method program*/
abstract class programming
{
    public abstract void Developer();
    public abstract void Rank();
}
class HTML extends programming
{
    @Override
    public void Developer()
    {
        System.out.println("Tim Berners Lee");
    }
    @Override
    public void Rank()
    {
        System.out.println("3rd");
    }
}
abstract class Java extends programming
{
    @Override
    public void Developer()
    {
        System.out.println("Games Gosling");
    }
}
class main
{
    public static void main(String[] args) {
        HTML h=new HTML();
        h.Developer(); h.Rank();
    }
}
