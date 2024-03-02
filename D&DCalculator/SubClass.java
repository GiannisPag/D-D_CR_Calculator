public class SubClass extends Player
{
    private String subclass;

    public SubClass(int lvl, String sb, String r)
    {
        super(lvl, sb, r);
    }

    public void setSubClass(String ssb)
    {
        this.subclass = ssb;
    }

    public String getSubClass()
    {
        return subclass;
    }
    
}
