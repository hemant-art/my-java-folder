class computer 
{
    public void playmusic()
    {
        System.out.println("playing music....");

    }
    public String getpen(int cost)
    {
        if(cost>=10)
        return "pen";
        else
        return "nothing";

    }
}
public class hello
{
    public static void main(String []args)
    {
        computer lol=new computer();
        lol. playmusic();
        String str=lol .getpen(10);
        System.out.println(str);
    }
}