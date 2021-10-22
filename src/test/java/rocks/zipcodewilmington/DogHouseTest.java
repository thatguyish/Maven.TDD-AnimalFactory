package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();

        DogHouse.remove(animal);
    }

    @Test
    public void getDogByIdTest(){
        Dog dog = new Dog("joe",new Date(),1);
        DogHouse.add(dog);


        Assert.assertEquals(dog,DogHouse.getDogById(dog.getId()));
        DogHouse.remove(dog);
    }

    @Test
    public void removeByIdTest(){
        Dog dog = new Dog("joe",new Date(),1);
        DogHouse.add(dog);

        DogHouse.remove(dog.getId());

        Assert.assertEquals(0,(int)DogHouse.getNumberOfDogs());
    }

    @Test
    public void removeTest(){
        Dog dog = new Dog("joe",new Date(),1);
        DogHouse.add(dog);

        DogHouse.remove(dog);

        Assert.assertEquals(0,(int)DogHouse.getNumberOfDogs());
    }
    @Test
    public void addTest(){
        Dog dog = new Dog("joe",new Date(),1);

        DogHouse.add(dog);

        Assert.assertEquals(1,(int)DogHouse.getNumberOfDogs());


        DogHouse.remove(dog);
    }
}
