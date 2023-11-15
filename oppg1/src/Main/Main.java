package Main;

public class Main
{
    public static void main(String[] args)
    {
        NewString a = new NewString("Dette er en String");
        System.out.println(a.Shorten());
        System.out.println(a.RemoveChar('e'));
    }
}