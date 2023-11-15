package Main;
import java.util.ArrayList;

import org.w3c.dom.Text;

public class TextProcessing
{
    String txt;
    TextProcessing(String in)
    {
        txt = in;
    }
    public int GetNoWords()
    {
        return txt.split(" ").length;
    }
    public float GetAvgWordLen()
    {
        ArrayList<Character> temp = new ArrayList<Character>();
        for(int i = 0; i < txt.length(); i++)
        {
            temp.add(txt.charAt(i));
        }
        for(int i = temp.size() - 1; i >= 0; i--)
        {
            if(!Character.isAlphabetic(temp.get(i)))
            {
                temp.remove(i);
            }
        }
        return ((float) temp.size())/GetNoWords();
    }
    public float GetAvgWrdsPerPeriod()
    {
        float noPeriods = 0;
        String[] temp = txt.split("");
        for(String s : temp)
        {
            if(s.equals(".") || s.equals("!") || s.equals(":") || s.equals("?"))
            {
                noPeriods++;
            }
        }
        return (float)GetNoWords()/noPeriods;
    }
    public void ReplaceWord(String del, String alteration)
    {
        txt = txt.replace(del, alteration);
    }
    public String GetString()
    {
        return txt;
    }
    public String GetUpperCase()
    {
        return txt.toUpperCase();
    }
}