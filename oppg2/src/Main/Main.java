package Main;

public class Main
{
    public static void main(String[] args)
    {
        TextProcessing a = new TextProcessing("To ord");
        TextProcessing b = new TextProcessing("Denne setningen har fem ord");
        TextProcessing c = new TextProcessing("Tre ord her");
        System.out.println(a.GetNoWords());
        System.out.println(b.GetNoWords());
        System.out.println(c.GetNoWords());
        System.out.println("##########");
        System.out.println(a.GetAvgWordLen());
        System.out.println(b.GetAvgWordLen());
        System.out.println(c.GetAvgWordLen());
        System.out.println("##########");
        TextProcessing d = new TextProcessing("To ord. To setninger også.");
        TextProcessing e = new TextProcessing("Denne setningen har ni ord, men bare én setning.");
        TextProcessing f = new TextProcessing("Tre ord her. Tre setninger også. Der.");
        System.out.println(d.GetAvgWrdsPerPeriod());
        System.out.println(e.GetAvgWrdsPerPeriod());
        System.out.println(f.GetAvgWrdsPerPeriod());
        System.out.println("##########");
        d.ReplaceWord("setning", "ting");
        e.ReplaceWord("setning", "ting");
        f.ReplaceWord("setning", "ting");
        System.out.println(d.GetString());
        System.out.println(e.GetString());
        System.out.println(f.GetString());
        System.out.println("##########");
        System.out.println(d.GetUpperCase());
        System.out.println(e.GetUpperCase());
        System.out.println(f.GetUpperCase());
    }
}