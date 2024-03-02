public class Player
{
    private int level;
    private String subClass;
    private String race;

    public Player(int lvl, String sb, String r)
    {
        level = lvl;
        subClass = sb;
        race = r;
    }

    public void setLevel(int lvl)
    {
        level = lvl;
    }

    public int getLevel()
    {
        return level;
    }

    public void setSubClass(String sb)
    {
        subClass = sb;
    }

    public String getSubClass()
    {
        return subClass;
    }

    public void setRace(String r)
    {
        race = r;
    }

    public String getRace()
    {
        return race;
    }
}