package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

    @Test
    public void checkMammalInheritance(){
        Cat cat = new Cat("jim",new Date(),1);

        Assert.assertTrue(cat instanceof Mammal);
    }

    @Test
    public void checkAnimalInheritance(){
        Cat cat = new Cat("jim",new Date(),1);

        Assert.assertTrue(cat instanceof Animal);
    }

    @Test
    public void getIdTest(){
        Cat cat = new Cat("jim",new Date(),1);

        Assert.assertEquals(1,(int)cat.getId());
    }

    @Test
    public void eatTest(){
        Food food = new Food();
        Cat cat = new Cat("jim",new Date(),1);

        cat.eat(food);

        Assert.assertEquals(1,(int)cat.getNumberOfMealsEaten());
    }

    @Test
    public void setBirthDateTest(){
        Date oldDate = new Date();

        Cat cat = new Cat("jim",oldDate,1);

        Date testDate = new Date();
        cat.setBirthDate(testDate);

        Assert.assertEquals(testDate,cat.getBirthDate());
    }

    @Test
    public void speakTest(){
        Cat cat = new Cat("jim",new Date(),1);

        Assert.assertEquals("meow!",cat.speak());
    }

    @Test
    public void setNameTest(){
        Cat cat = new Cat("jim",new Date(),1);

        cat.setName("bob");

        Assert.assertEquals("bob",cat.getName());
    }

    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

}
