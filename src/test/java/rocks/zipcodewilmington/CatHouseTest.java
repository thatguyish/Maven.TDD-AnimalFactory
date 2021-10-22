package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`


    @Test
    public void getNumberOfCatsTest(){
        Cat cat = new Cat("joe",new Date(),1);
        CatHouse.add(cat);

        CatHouse.remove(cat.getId());

        Assert.assertEquals(0,(int)CatHouse.getNumberOfCats());

        CatHouse.remove(cat);
    }


    @Test
    public void getCatByIdTest(){
        Cat cat = new Cat("joe",new Date(),1);
        CatHouse.add(cat);


        Assert.assertEquals(cat,CatHouse.getCatById(cat.getId()));
        CatHouse.remove(cat);
    }

    @Test
    public void removeByIdTest(){
        Cat cat = new Cat("joe",new Date(),1);
        CatHouse.add(cat);

        CatHouse.remove(cat.getId());

        Assert.assertEquals(0,(int)CatHouse.getNumberOfCats());
    }

    @Test
    public void removeTest(){
        Cat cat = new Cat("joe",new Date(),1);
        CatHouse.add(cat);

        CatHouse.remove(cat);

        Assert.assertEquals(0,(int)CatHouse.getNumberOfCats());
    }
    @Test
    public void addTest(){
        Cat cat = new Cat("joe",new Date(),1);

        CatHouse.add(cat);

        Assert.assertEquals(1,(int)CatHouse.getNumberOfCats());


        CatHouse.remove(cat);
    }
}
