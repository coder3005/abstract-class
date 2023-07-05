/*abstract method program*/
abstract class programming
{
    public abstract void Developer();
    public abstract void Rank();
}
abstract class HTML extends programming
{
    @Override
    public void Developer()
    {
        System.out.println("Tim Berners Lee");
    }
}
class Java extends HTML 
{
    @Override
    public void Rank()
    {
        System.out.println("2nd");
    }
}
class main
{
    public static void main(String[] args) {
        HTML h=new Java();
        h.Developer(); h.Rank();
    }
}
