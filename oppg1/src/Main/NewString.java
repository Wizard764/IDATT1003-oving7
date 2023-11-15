package Main;

public final class NewString
{
    String txt;
    String[] words;
    NewString(String in)
    {
        txt = in;
    }
    private void Split(String reg)
    {
        words = txt.split(reg);
    }
    public String Shorten()
    {
        Split(" ");
        String res = "";
        for(String w : words)
        {
           res += w.charAt(0);
        }
        return res;
    }
    public String RemoveChar(char c)
    {
        String[] txtMod = txt.split("");
        String res = "";
        String del = Character.toString(c);
        for(String i : txtMod)
        {
            if(!i.equals(del))
            {
                res += i;
            }
        }
        return res;
    }
}