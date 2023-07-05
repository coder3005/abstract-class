/*abstract method program*/
abstract class programming
{
    public abstract void Developer();
}
class HTML extends programming
{
    @Override
    public void Developer()
    {
        System.out.println("Tim Berners Lee");
    }
}
class Java extends programming
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
        HTML h=new HTML(); /* if  we write 'programming' in place of 'HTML' then the same output will come */
        h.Developer();
        Java j=new Java(); /* if  we write 'programming' in place of 'Java' then the same output will come */
        j.Developer(); /* we have to write 'programming' simultaneously as mentioned above */
    }
}
