import java.util.ArrayList;

public class Runner
{
    public static void main(String[] args)
    {
        // DO NOW: Here are some objects
        Animal animal = new Animal("some animal");
        Cow cow = new Cow("Mr. Moo Cow");
        Dog dog = new Dog("Fido");
        Puppy puppy = new Puppy("Lil Rascal");
        // PREDICT which, if any, of the following will print "false"?
        System.out.println(animal instanceof Animal); // a true
        System.out.println(cow instanceof Animal);    // b true
        System.out.println(cow instanceof Cow);       // c true
        System.out.println(dog instanceof Animal);    // d true
        System.out.println(dog instanceof Dog);       // e  true
        System.out.println(puppy instanceof Animal);  // f true
        System.out.println(puppy instanceof Dog);     // g true
        System.out.println(puppy instanceof Puppy);   // h true
        System.out.println(animal instanceof Object); // i true
        System.out.println(cow instanceof Object);    // j true
        System.out.println(dog instanceof Object);    // k true
        System.out.println(puppy instanceof Object);  // l true
        System.out.println(dog instanceof Puppy);     // m false

        // ----------------------- WARM UP -----------------------------
        // Exercise 1: Create an empty ArrayList of Animal objects
        // (name it whatever you want); you will need to import ArrayList.
        // then add the four objects from the Do Now (animal, cow, dog, puppy)
        // to the ArrayList, in any order, using the "add" ArrayList method.
        ArrayList<Animal> myArray = new ArrayList<>();
        myArray.add(animal);
        myArray.add(cow);
        myArray.add(dog);
        myArray.add(puppy);

        // Exercise 2: use an ENHANCED for loop to loop through the
        // arraylist and call the talk() method on each object.
        for (Animal item : myArray)
        {
            item.talk();
        }

        // Exercise 3: use a standard INDEX-BASED for loop to again
        // call the talk() method on each object.
        for (int i = 0; i < myArray.size(); i++)
        {
            myArray.get(i).talk();
        }

        // Exercise 4: same as Exercise 1, except use an array of type Animal.
        Animal[] Array = {animal, cow, dog, puppy};

        // Exercise 5: modify either of the loops from 2 or 3 above to attempt
        // to call the fetch() method on each object instead of talk().
        // does the code compile when you do this?  if not, why not?
        // can you figure out a way to get it to compile and run?

        for (Animal item : Array)
        {
            if (item instanceof Dog)
            {
                ((Dog) item).fetch();
            }
        }

        System.out.println("-------------------------");

        Animal animal2 = new Animal("some animal");
        Cow cow2 = new Cow("Mr. Moo Cow");
        Dog dog2 = new Dog("Fido");
        Puppy puppy2 = new Puppy("Lil Rascal");
        Vet amySmith = new Vet("Amy Smith");
        amySmith.addClient(animal2); // not a client yet
        amySmith.addClient(cow2);    // not a client yet
        amySmith.addClient(dog2);    // not a client yet
        amySmith.addClient(puppy2);  // not a client yet
        amySmith.addClient(animal2); // ALREADY A CLIENT
        amySmith.addClient(cow2);    // ALREADY A CLIENT
        amySmith.addClient(dog2);    // ALREADY A CLIENT
        amySmith.addClient(puppy2);  // ALREADY A CLIENT

    }
}