import java.util.ArrayList;

public class Vet
{
    private String name;
    private ArrayList<Animal> clients;

    public Vet(String name)
    {
        this.name = name;
        clients = new ArrayList<>();
    }

    public void addClient(Animal item)
    {
        if (clients.indexOf(item) == -1)
        {
            clients.add(item);
            System.out.println("Welcome to " + name + "'s office, " + item.getName() + " !");
        }
        else
        {
            System.out.println(item.getName() + " is already a client of " + name + "!");
        }
    }
}