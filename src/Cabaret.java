import java.util.ArrayList;
public class Cabaret
{
    private String name;
    private ArrayList<Performer> performers;

    public Cabaret(String name)
    {
        this.name = name;
        performers = new ArrayList<>();
    }

    public String getName()
    {
        return name;
    }

    public ArrayList<Performer> getPerformers()
    {
        return performers;
    }

    public boolean addPerformer(Performer performer)
    {
        if (performers.indexOf(performer) == -1)
        {
            performers.add(performer);
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean removePerformer(Performer performer)
    {
        for (int i = 0; i < performers.size(); i++)
        {
            if (performers.get(i).equals(performer))
            {
                performers.remove(i);
                return true;
            }
        }
        return false;
    }

    public double averagePerformerAge()
    {
        double sum = 0;
        for (Performer item : performers)
        {
            sum += item.getAge();
        }
        return sum / performers.size();
    }

    public ArrayList<Performer> performersOverAge(int age)
    {
        ArrayList<Performer> returnList = new ArrayList<>();
        for (Performer item : performers)
        {
            if (item.getAge() >= age)
            {
                returnList.add(item);
            }
        }
        return returnList;
    }

    public void groupRehearsal()
    {
        for (Performer item : performers)
        {
            System.out.println("REHEARSAL CALL! " + item.getName());
            if (item instanceof Comedian)
            {
                Comedian temp = (Comedian) item;
                temp.rehearse(false);
            }
            else
            {
                item.rehearse();
            }

        }
    }

    public void cabaretShow()
    {
        for (Performer item : performers)
        {
            System.out.println("Welcome to the cabaret! Next act up..." + item.getName());
            if (item instanceof Dancer)
            {
                ((Dancer) item).pirouette(2);
                item.perform();
            }
            else
            {
                item.perform();
            }
        }
    }
}