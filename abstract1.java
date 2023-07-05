/* abstract class program */
abstract class animal   
{
    public abstract void sound();
}
class dog extends animal
{
    public void sound()
    {
        System.out.println("Dog is Barking");
    }
}
class lion extends animal
{
    public void sound()
    {
        System.out.println("Lion is Roar");
    }
}
class test
{
    public static void main(String[] args) {
        dog d=new dog();
        lion l=new lion();
        d.sound(); l.sound();
    }
}
