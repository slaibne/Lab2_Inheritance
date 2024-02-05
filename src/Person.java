public class Person
{
    private String id;
    private String fName;
    private String lName;
    private String title;
    private int yob;

    public Person(String id, String fName, String lName, String title, int yob)
    {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.title = title;
        this.yob = yob;
    }

    public String getId()
    {
        return id;
    }
    public void setId(String id)
    {
        this.id = id;
    }
    public String getfName()
    {
        return fName;
    }
    public void setfName(String fName)
    {
        this.fName = fName;
    }
    public String getlName()
    {
        return lName;
    }
    public void setlName(String lName)
    {
        this.lName = lName;
    }
    public String getTitle()
    {
        return title;
    }
    public void setTitle(String title)
    {
        this.title = title;
    }
    public int getYob()
    {
        return yob;
    }
    public void setYob(int yob)
    {
        this.yob = yob;
    }

    @Override
    public String toString()
    {
        return "Person{" +
                "id='" + id + '\'' +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", title='" + title + '\'' +
                ", yob=" + yob +
                '}';
    }

    public String toCSV()
    {
        return id + ", " + fName + ", " + lName + ", " + title + ", " + yob;
    }

    public String getFullName()
    {
        return fName + " " + lName;
    }
    public String getFormalName()
    {
        return title + " " + fName + " " + lName;
    }

    public String getAge()
    {
        return String.valueOf(2023-yob);
    }
    public String getAge(int year)
    {
        return String.valueOf(year-yob);
    }

}